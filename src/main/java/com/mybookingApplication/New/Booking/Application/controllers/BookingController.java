package com.mybookingApplication.New.Booking.Application.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mybookingApplication.New.Booking.Application.Entities.Bookings;
import com.mybookingApplication.New.Booking.Application.Entities.Rooms;
import com.mybookingApplication.New.Booking.Application.Entities.Workers;
import com.mybookingApplication.New.Booking.Application.Service.BookingAppService;

@Controller
@SessionAttributes("workerId")
public class BookingController {
private BookingAppService bookingAppService;

public BookingController(BookingAppService bookingAppService) {
	this.bookingAppService =bookingAppService;
}
//String guestFirstName, String guestLastName, String guestAddress, Rooms room,
//Workers worker, LocalDateTime checkingTime,  LocalDateTime checkOutTime
@RequestMapping(value = "bookARoom", method = RequestMethod.GET)
public String showRooms(ModelMap model) {
	Bookings booking = (new Bookings("", "", "", bookingAppService.getOneRoom(1001l), bookingAppService.getWorkerById(1), 
       LocalDateTime.now(), LocalDateTime.now().plusDays(1)));
	String lastName = (String)model.get("lastName");
	model.put("lastName", lastName);
	model.put("booking", booking);
	return "bookingPage";
}
@RequestMapping(value = "bookARoom", method = RequestMethod.POST)
public String bookARoom(ModelMap model, Bookings booking, @RequestParam long duration, 
		@RequestParam long roomNumber) {
	//long id =model.get(workerId);
	bookingAppService.addBooking(booking.getGuestFirstName(), booking.getGuestLastName(), booking.getGuestAddress(),
			                                                roomNumber, duration, model);
	model.put("roomNumber",roomNumber);
	//model.put("workerId",workerId);
	return "redirect:bookings";
}

@RequestMapping("bookings")
public String rooms(ModelMap model) {
	List<Rooms>allRooms = bookingAppService.getAllRooms();
	List<Bookings>allBookings = bookingAppService.getAllBookings();
	
	//String lastName = (String)model.get("lastName");
	//model.put("lastName", lastName);
	long id =0l;
	 id = (long) model.get("workerId");
	String lastName = bookingAppService.getWorkerById(id).getLastName();
	model.put("lastName", lastName);
	model.put("allBookings", allBookings);
	//model.put("allRooms",allRooms );
	return "rooms";
	
}
@RequestMapping(value= "cancelBooking")
public String cancelBooking(@RequestParam long id) {
bookingAppService.cancelRoomBooking(id);
return "redirect:bookings";
}


}
