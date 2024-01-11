package com.email.salesslip.service;

public interface EmailService {
    void sendHtmlEmail(String to, String cc, String subject, String templateName, Object data,String senderEmail);

}
