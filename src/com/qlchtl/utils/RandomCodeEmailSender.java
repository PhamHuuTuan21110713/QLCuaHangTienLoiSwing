package com.qlchtl.utils;

import java.util.Random;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class RandomCodeEmailSender {

    public static void sendRandomCode(String email,String code) {
        String subject = "Your Random Code";
        String message = "Your random code is: " + code;

        try {
            sendEmail(email, subject, message);
        } catch (MessagingException ex) {
            System.out.println("Failed to send email: " + ex.getMessage());
        }
    }



    private static void sendEmail(String to, String subject, String message) throws MessagingException {
        // Replace these with your email provider's details
        String from = "thongdzpro100@gmail.com";
        String password = "xjvl ltdd lrbw kpjg";
        String host = "smtp.gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587"); // Update this if your email provider uses a different port

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        MimeMessage mimeMessage = new MimeMessage(session);
        mimeMessage.setFrom(new InternetAddress(from));
        mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        mimeMessage.setSubject(subject);
        mimeMessage.setText(message);

        Transport.send(mimeMessage);
    }
}