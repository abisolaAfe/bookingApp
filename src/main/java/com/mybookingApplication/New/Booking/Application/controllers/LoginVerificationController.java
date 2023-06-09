package com.mybookingApplication.New.Booking.Application.controllers;

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
//@SessionAttributes("lastName")
@SessionAttributes("workerId")
public class LoginVerificationController {
private BookingAppService bookingAppService;


public LoginVerificationController(BookingAppService bookingAppService) {
	super();
	this.bookingAppService = bookingAppService;
}

@RequestMapping (value ="loginPage", method = RequestMethod.GET)
public String welcomePage() {
	return "loginPage";
	
}

@RequestMapping (value ="loginPage", method = RequestMethod.POST)
public String homePage(@RequestParam String loginName, @RequestParam String password, ModelMap model) {
	String errPage = "";
	if(bookingAppService.loginverify(loginName, password) ==true) {
		Workers worker = bookingAppService.getWorkerByUserName(loginName);
		String role = worker.getRole();
		long workerId = worker.getWokersId();
		if (role.equals("receptionist")){
			 model.put("workerId", workerId);
			return "redirect:receptionistHome";
		}
		else if (role.equals("cleaner")){
		    model.put("workerId", workerId);
			//model.put("lastName", worker.getLastName());
			return "redirect:cleaning-homepage";
		}
		else if (role.equals("manager")){
			  model.put("workerId", workerId);
			return "redirect:managerHome";
		}
	}else {
		 errPage= "loginPage";
	}
		model.put("errorMessage","Please enter a valid credentials");
		return  errPage;
	
	
	//return "loginPage";
	
}
@RequestMapping(value="managerHome")
public String managerHomePage(ModelMap model) {
	long id =0l;
	 id = (long) model.get("workerId");
	String lastName = bookingAppService.getWorkerById(id).getLastName();
	model.put("lastName", lastName);
	return "manager";
}

@RequestMapping(value="receptionistHome")
public String receptionistHomePage(ModelMap model) {
	long id =0l;
	 id = (long) model.get("workerId");
	String lastName = bookingAppService.getWorkerById(id).getLastName();
	model.put("lastName", lastName);
	return "receptionist";
}

@RequestMapping(value="waiterHome")
public String waiterHomePage(ModelMap model) {
	long id =0l;
	 id = (long) model.get("workerId");
	String lastName = bookingAppService.getWorkerById(id).getLastName();
	model.put("lastName", lastName);
	return "sales";
}



	
}
