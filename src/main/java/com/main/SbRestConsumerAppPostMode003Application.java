package com.main;

 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SbRestConsumerAppPostMode003Application {

	public static void main(String[] args) {
		SpringApplication.run(SbRestConsumerAppPostMode003Application.class, args);
		/*//Create RestTemplate Object
		RestTemplate temp = new RestTemplate();
		//define service url
		String url = "http://localhost:8080/api/register";
		String registerJsonData = "{\"id\":1001,\"docName\":\"Sukanta\",\"salary\":4000.0,\"specialization\":\"Nurology\"}";
		//prepare header
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		//prepare Http request as HttpEntity obj having head, body
		HttpEntity<String> request = new HttpEntity<String>(registerJsonData, header);
		//make http request call in post mode
		   ResponseEntity<String> response = temp.postForEntity(url, request, String.class);
		   System.out.println("Response Body : "+response.getBody());
		   System.out.println("Status Code Value : "+response.getStatusCodeValue());
		   System.out.println("Status Code : "+response.getStatusCode());
		   
		   System.exit(0);*/
	}

}