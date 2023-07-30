package com.mybookingApplication.New.Booking.Application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UnprotectedUrls {

@RequestMapping(value="discription")
public String discription() {
	return "discription";
}
	
	
}
