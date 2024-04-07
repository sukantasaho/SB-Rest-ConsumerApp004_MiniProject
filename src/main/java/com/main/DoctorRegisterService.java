package com.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DoctorRegisterService implements CommandLineRunner 
{

	@Override
	public void run(String... args) throws Exception 
	{
		/*
		 * //Create RestTemplate Object RestTemplate temp = new RestTemplate(); //define
		 * service url String url = "http://localhost:8080/api/register"; String
		 * registerJsonData =
		 * "{\"docName\":\"Anshika\",\"income\":5600.0,\"specialization\":\"dermitology\"}";
		 * //prepare header HttpHeaders header = new HttpHeaders();
		 * header.setContentType(MediaType.APPLICATION_JSON); //prepare Http request as
		 * HttpEntity obj having head, body HttpEntity<String> request = new
		 * HttpEntity<String>(registerJsonData, header); //make http request call in
		 * post mode ResponseEntity<String> response = temp.postForEntity(url, request,
		 * String.class); System.out.println("Response Body : "+response.getBody());
		 * System.out.println("Status Code Value : "+response.getStatusCodeValue());
		 * System.out.println("Status Code : "+response.getStatusCode());
		 * 
		 * System.exit(0);
		 */
	}

}
