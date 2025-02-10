package com.in.akshay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in.akshay.service.ReportService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ReportService reportServie = context.getBean(ReportService.class);
		String reportData = reportServie.getReportDataFromDaoImpl();
		System.out.println(reportData);
	}

}
