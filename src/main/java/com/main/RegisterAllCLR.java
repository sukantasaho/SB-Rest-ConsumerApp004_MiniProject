package com.main;

 

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RegisterAllCLR implements CommandLineRunner 
{

	@Override
	public void run(String... args) throws Exception 
	{
		/*
		 * //Create Rest Template object RestTemplate temp = new RestTemplate(); String
		 * url = "http://localhost:8080/api/registerAll"; String jsonData =
		 * "[{\"docName\":\"Jeevan\",\"income\":32000.0,\"specialization\":\"dermitology\"},{\"docName\":\"Aakash\",\"income\":89000.0,\"specialization\":\"dermitology\"}]";
		 * //prepare header HttpHeaders header = new HttpHeaders();
		 * header.setContentType(MediaType.APPLICATION_JSON); HttpEntity<String> request
		 * = new HttpEntity<String>(jsonData,header); ResponseEntity<String> response =
		 * temp.postForEntity(url, request, String.class);
		 * System.out.println("Response Body : "+response.getBody());
		 * System.out.println("Response status code value : "+response.
		 * getStatusCodeValue());
		 * System.out.println("status code : "+response.getStatusCode());
		 * 
		 * System.exit(0);
		 */
		

		 //create Rest Template Object
		  RestTemplate temp = new RestTemplate();
		  String url = "http://localhost:8080/api/getAllDoctors";
		  ResponseEntity<String> res =  temp.getForEntity(url, String.class);
		  System.out.println(res.getBody());
		  System.exit(0);
	}

}
