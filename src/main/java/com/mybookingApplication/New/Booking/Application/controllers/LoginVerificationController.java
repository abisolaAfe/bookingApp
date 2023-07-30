package com.mybookingApplication.New.Booking.Application.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

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

@RequestMapping (value ="/", method = RequestMethod.GET)
public String welcomePage() {
	return "loginPage";
	
}

@RequestMapping (value ="/", method = RequestMethod.POST)
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

@RequestMapping(value="logout")
public String logout(ModelMap model) {
	return "redirect:/";
}

@RequestMapping(value="get-info")
public String loginInfo(ModelMap model) {
	return "loginInfo";
}

@RequestMapping(value="dashboard")
public String dashboard(ModelMap model) {
	 long id = (long) model.get("workerId");
	String role = bookingAppService.getWorkerById(id).getRole();
	if (role.equals("receptionist")){
		return "redirect:receptionistHome";
	}
	else if (role.equals("cleaner")){
		return "redirect:cleaning-homepage";
	}
	else if (role.equals("manager")){
		return "redirect:managerHome";
	}
	return null;
}
	
}
