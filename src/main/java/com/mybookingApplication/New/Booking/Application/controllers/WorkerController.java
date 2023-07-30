package com.mybookingApplication.New.Booking.Application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mybookingApplication.New.Booking.Application.Entities.Role;
import com.mybookingApplication.New.Booking.Application.Service.BookingAppService;
import com.mybookingApplication.New.Booking.Application.security.SpringSecurityConfiguration;

@Controller
public class WorkerController {
	
	private BookingAppService bookingAppService;
	
	     
		public WorkerController(BookingAppService bookingAppService) {
		super();
		this.bookingAppService = bookingAppService;
		
	}

		@RequestMapping(value ="/add-worker", method = RequestMethod.GET)
		public String addWorkerGet(){
		return "addAworker";
		}
	//String firstName, String lastName,String userName,String password, String role
	@RequestMapping(value ="/add-worker", method = RequestMethod.POST)
	public String addWorkerPost( @RequestParam String firstName,  @RequestParam String lastName,
			@RequestParam String loginName, @RequestParam String password,@RequestParam String role, ModelMap model){
		bookingAppService.addWorker(firstName, lastName, loginName,password,role);
		model.put("profileCreated","Profile has been created succesfully");
	return "addAworker";		
		}

	//public Optional<Workers> findworker(long Id)  {
	//return workerRepo.findById(Id);	
	//
	//	
	//}
}
