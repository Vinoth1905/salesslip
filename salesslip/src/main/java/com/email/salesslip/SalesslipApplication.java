package com.email.salesslip;

import com.email.salesslip.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalesslipApplication implements CommandLineRunner {
	@Autowired
	private EmailService emailService;
	public static void main(String[] args) {
		SpringApplication.run(SalesslipApplication.class, args);
		System.out.println("Sales Slip Project started..");
	}

	@Override
	public void run(String... args) throws Exception {
		String to = "vinoth19052000@gmail.com";
		String cc = "vinoth@gomobi.io";
		String subject = "Mail From Vinoth";
		String templateName = "template.html";
		String dynamicValue = "Dynamic Data from Backend";
		String senderEmail = "vinoth@gomobi.io";
		// Pass dynamic data to the template
		emailService.sendHtmlEmail(to,cc, subject, templateName, new EmailData(dynamicValue), senderEmail);
	}
}
