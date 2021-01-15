package com.cognizant.converter;

import java.io.File;
import java.io.IOException;

import com.cognizant.entity.Customer;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserializer {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		File file = new File("target/customer.json");
		if(file.exists()) {
			ObjectMapper mapper = new ObjectMapper();
			Customer customer=mapper.readValue(file, Customer.class);
					System.out.println(customer);
		}
		else {
			System.out.println("JSON data not available");
		}
	}

}
