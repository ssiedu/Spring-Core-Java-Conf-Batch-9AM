package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String args[]) {
		
		//we will ask spring to provide us a customer instance
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		Customer customer=context.getBean("customer",Customer.class);
		System.out.println(customer);
	
		//CountryInfo info=context.getBean("countryInfo",CountryInfo.class);
		//System.out.println(info);
	}
}
