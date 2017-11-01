package com.sample.demo.controller;


import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;


@Component
public class InternalGreetings implements Endpoint<String>{


	@Override
	public String getId() {
		// TODO Auto-generated method stub
		  return "internal-greetings";
	}

	@Override
	public String invoke() {
		// TODO Auto-generated method stub
		return "Hello Management";
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isSensitive() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
