package com.cognizant.converter;

import java.io.File;
import java.io.IOException;

import com.cognizant.entity.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class Serializer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("jaya");
		customer.setCustomerEmail("jayalakshmi@gmail.com");
		
		ObjectMapper objMapper = new ObjectMapper();
		
		String jsonString = objMapper.writeValueAsString(customer);
		System.out.println(jsonString);
		
		ObjectWriter objWriter= objMapper.writerWithDefaultPrettyPrinter();
		jsonString = objWriter.writeValueAsString(customer);
		System.out.println(jsonString);

		objMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/customer.json"), customer);
	}

}
