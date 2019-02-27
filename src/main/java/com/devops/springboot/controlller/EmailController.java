package com.devops.springboot.controlller;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	
	private static final Logger logger = LoggerFactory.getLogger(FileController.class);
	
    @Autowired
    private JavaMailSender sender;

    @RequestMapping("/sendmail")
    public String sendMail() {
    	logger.info("Send Email");
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        try {
            helper.setTo("sridevi.bathuru@gmail.com");
            helper.setSubject("Mail From Spring Boot");
            helper.setText("Greetings :)\n Please find the attached docuemnt for your reference.");
            
        } catch (MessagingException e) {
            e.printStackTrace();
            return "Error while sending mail ..";
        }
        sender.send(message);
        return "Mail Sent Success!";
    }
    
    @RequestMapping("/sendmailatt")
    public String sendMailAttachment() throws MessagingException {
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,true);
        try {
            helper.setTo("sridevi.bathuru@gmail.com");
            helper.setSubject("Mail From Spring Boot");
            helper.setText("Greetings :)\n Please find the attached docuemnt for your reference.");
            //ClassPathResource file = new ClassPathResource("document.PNG");
            //helper.addAttachment("document.PNG", file);
        } catch (MessagingException e) {
            e.printStackTrace();
            return "Error while sending mail ..";
        }
        sender.send(message);
        return "Mail Sent Success!";
    }

}