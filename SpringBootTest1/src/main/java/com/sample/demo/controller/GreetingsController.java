package com.sample.demo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.ws.rs.Produces;

@RestController
public class GreetingsController {
	
	
	 @RequestMapping(value = "/greetings",  method=RequestMethod.GET)
	 @Produces("application/json")
	 public ResponseEntity<?> getMessage(){
		    return new ResponseEntity<String>("Hello World", HttpStatus.ACCEPTED);
		}
	

}
