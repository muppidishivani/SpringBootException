package com.exception.controller;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.exception.model.BookModel;
import com.exception.service.BookService;
import com.nimbusds.oauth2.sdk.TokenResponse;
import com.nimbusds.openid.connect.sdk.UserInfoResponse;

@Controller
public class BookController {

	@Autowired
	BookService service;
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Value("${spring.security.oauth2.client.registration.google.client-id}")
	
	private String clientId;
	@Value("${spring.security.oauth2.client.registration.google.client-secret}")
	private String clientSecret;
	
	@GetMapping("/")
	public String getForm()
	{
		System.out.println("This is SpringBootApplication");
		System.out.println("This is SpringBootApplication");
		return "add-book";
	}
	
	@PostMapping("/books")
	public String bookData(BookModel bookModel,Model model)
	{
	
		
		
			service.saveBook(bookModel);
		
		return "success";

	
	}

	
//	@GetMapping("/callback")
//	public ResponseEntity<?> handleGoogleCallback(RequestParam String code)
//	{
//		try {
//			String tokenEndPoint="https://oauth2.googleapis.com/token";
//			Map<String ,String> params=new HashMap<>();
//			params.put("code", code);
//			params.put("client_id", clientId);
//			params.put("client_secret", clientSecret);
//			params.put("redirect_url", "https://developers.google.com/oauthplayground");
//			params.put("grant_type", "authorization_code");
//			
//			HttpHeaders headers=new HttpHeaders();
//			headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
//			HttpEntity<Map<String,String>> request=new HttpEntity<Map<String,String>>(params,headers);
//			ResponseEntity<Map> tokenResponse=restTemplate.postForEntity(tokenEndPoint, request, Map.class);
//         
//			String idToken=tokenResponse.getBody().get("id_token");
//			String userInfoUrl="https://oauth2.googleapis.com/tokeninfo?id_token=" +idToken;
//			ResponseEntity<Map> userInfoResponse=restTemplate.getForEntity(userInfoUrl,Map.class);
//			if(userInfoResponse.getStatusCode()==HttpStatus.OK)
//			{
//				Map<String,Object> userInfo=userInfoResponse.getBody();
//				String email=(String) userInfo.get("email");
//				UserDetails userDetails=userDetailsService.loadUserByUsername(email);
//				if(userDetails==null)
//				{
//					User user=new user();
//					user.setUsername(email);
//					user.setPassword(PasswordEncoder.encode(UUID.randomUUID().toString()));
//					//user.set
//				}
//			}
//			 
//		}
//		catch(Exception ex)
//		{
//			
//		}
//	}
//	
}
