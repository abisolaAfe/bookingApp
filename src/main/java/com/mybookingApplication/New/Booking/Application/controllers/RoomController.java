package com.mybookingApplication.New.Booking.Application.controllers;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mybookingApplication.New.Booking.Application.Service.BookingAppService;


@Controller
public class RoomController {
	private BookingAppService bookingAppService;

	//public RoomController() {
	//	
	//}	

	public RoomController(BookingAppService bookingAppService) {
		super();
		this.bookingAppService = bookingAppService;

	}
	
	@RequestMapping(value = "add-room", method = RequestMethod.GET)
	public String addRoom() {
		return "addARoom";
		
	}
    
	@RequestMapping(value = "add-room", method = RequestMethod.POST)
	public String addRoomPosting(@RequestParam long roomNum ) {

		
		bookingAppService.addRoom(roomNum,LocalDateTime.now());
		return "addARoom";
		
		
	}
	


}
