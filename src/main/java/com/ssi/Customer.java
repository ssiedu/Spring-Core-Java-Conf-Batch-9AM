package com.ssi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Customer {
	private String code;
	private String name;
	@Autowired
	@Qualifier("address2")
	private Address address;
	@Autowired
	private CountryInfo countryInfo;
	
	public void start() {
		System.out.println("Init-Method- > start is called...!");
	}
	public void stop() {
		
	}
}
