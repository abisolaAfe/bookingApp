package com.mybookingApplication.New.Booking.Application.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mybookingApplication.New.Booking.Application.Entities.Rooms;
import com.mybookingApplication.New.Booking.Application.Entities.Workers;
import com.mybookingApplication.New.Booking.Application.Service.BookingAppService;

@Controller
@SessionAttributes("workerId")
public class CleaningController {
private BookingAppService bookingAppService;

public CleaningController(BookingAppService bookingAppService) {
	super();
	this.bookingAppService = bookingAppService;
}
@RequestMapping(value="cleaning", method = RequestMethod.GET)
public String cleaningGet() {
	return "cleaning";
}
@RequestMapping(value="cleaning", method = RequestMethod.POST)
public String cleaningPost( @RequestParam String workerRole,@RequestParam Long roomNum
	                                            ) {
	Workers worker = bookingAppService.getOneWorkerr(workerRole); 
	Rooms room = bookingAppService.getOneRoom(roomNum);
	bookingAppService.addCleaning(room, worker, LocalDateTime.now(), false);
	return "cleaning";
}
@RequestMapping("update-cleaning")
public String updateCleaning(@RequestParam Long id) {
	bookingAppService.updateCleaningStatus(id);
	return "redirect:cleaning-homepage";
}

@RequestMapping("cleaning-homepage")
public String cleaningHome(ModelMap model) {
	List<Rooms>allRooms = bookingAppService.getAllRooms();
	//String lastName = (String)model.get("lastName");
	long id =0l;
	 id = (long) model.get("workerId");
	String lastName = bookingAppService.getWorkerById(id).getLastName();
	model.put("lastName", lastName);
	model.put("allRooms",allRooms );
	return "cleaner";
	
}

}
