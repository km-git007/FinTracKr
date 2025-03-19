package com.fintrackr.service.email;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
@Slf4j
public class EmailService {

    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    /**
     * Sends a simple text email asynchronously.
     */
    @Async
    public void sendTextEmail(String to, String subject, String body) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(to);
            message.setSubject(subject);
            message.setText(body);
            mailSender.send(message);

            log.info("Text email sent successfully to {}", to);
        } catch (MailException e) {
            log.error("Failed to send text email to {}: {}", to, e.getMessage());
        }
    }

    /**
     * Sends an HTML email asynchronously with optional CC & BCC recipients.
     */
    @Async
    public void sendHtmlEmail(String to, String subject, String htmlBody, String[] cc, String[] bcc) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED, StandardCharsets.UTF_8.name());

            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(htmlBody, true);

            if (cc != null && cc.length > 0) helper.setCc(cc);
            if (bcc != null && bcc.length > 0) helper.setBcc(bcc);

            mailSender.send(message);

            log.info("HTML email sent successfully to {}", to);
        } catch (MessagingException | MailException e) {
            log.error("Failed to send HTML email to {}: {}", to, e.getMessage());
        }
    }
}
