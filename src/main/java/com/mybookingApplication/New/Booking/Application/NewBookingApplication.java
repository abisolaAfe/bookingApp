package com.mybookingApplication.New.Booking.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@SpringBootApplication
public class NewBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewBookingApplication.class, args);
	}

}
