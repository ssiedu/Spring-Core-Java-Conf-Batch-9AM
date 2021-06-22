package com.ssi;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Component
public class CountryInfo {
	private String countryName;
	private String countryCode;
	
	public CountryInfo() {
		countryName="India";
		countryCode="91";
	}
}
