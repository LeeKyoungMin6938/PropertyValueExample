package com.websystique.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.configuration.AppConfig;
import com.websystique.spring.service.FileService;

public class AppMain {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		FileService service = (FileService)ctx.getBean("fileService");
		
		service.readValues();
		ctx.close();
		
	}

}
