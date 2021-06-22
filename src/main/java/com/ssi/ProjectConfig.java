package com.ssi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.ssi")
public class ProjectConfig {
	//in this class you will configure all your beans which you want your container to manage.
	
	@Bean(initMethod="start",destroyMethod="stop")
	@Scope("singleton")
	@Lazy
	public Customer customer() {
		Customer c=new Customer();
		c.setCode("C111");
		c.setName("ABC");
		//c.setAddress(address());
		return c;
	}
	@Bean
	public Address address1() {
		Address adr=new Address("Bhopal","MP");
		return adr;
	}
	@Bean
	public Address address2() {
		Address adr=new Address("Mumbai","MH");
		return adr;
	}
	/*
	@Bean
	public CountryInfo countryInfo() {
		return new CountryInfo();
	}
	*/
}
