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
import com.mybookingApplication.New.Booking.Application.Entities.Sales;
import com.mybookingApplication.New.Booking.Application.Entities.Workers;
import com.mybookingApplication.New.Booking.Application.Service.BookingAppService;
@SessionAttributes("workerId")
@Controller
public class SalesController {

private BookingAppService bookingAppService;
	
	
	public SalesController(BookingAppService bookingAppService) {
		super();
		this.bookingAppService = bookingAppService;
	}
//Workers worker, Rooms room, String itemDescription,  int price, int quantity, LocalDateTime timeOfSales,double amount)
	@RequestMapping(value = "add-sales", method = RequestMethod.GET)
	public String addSales(ModelMap model) {
		Sales sale = (new Sales( bookingAppService.getWorkerById(1000),bookingAppService.getOneRoom(1001l), "", 1,1,
			LocalDateTime.now().toString(),2.0));
		 model.put("sale", sale);
		 List<Rooms>allRooms= bookingAppService.getAllRooms();
	      model.put("allRooms", allRooms);
		return "addSales";
	}
	@RequestMapping (value = "add-sales", method = RequestMethod.POST)
	  public String addingSales( ModelMap model,Sales sale,@RequestParam long dropdown) {
		//double amount = sale.getPrice()*sale.getQuantity();
		bookingAppService.addOneSales(bookingAppService.getOneRoom(dropdown),sale.getItemDescription(),
				sale.getPrice(),sale.getQuantity(),model);
		
		     
		
	 
	return  "redirect:sales" ;
	}
	
	@RequestMapping(value="sales",method = RequestMethod.GET)
	public String listSales(ModelMap model) {
    List<Sales>allSales =bookingAppService.getAllSales();
      long id =0l;
 	 id = (long) model.get("workerId");
 	String lastName = bookingAppService.getWorkerById(id).getLastName();
 	model.put("lastName", lastName);
 	model.put("allSales", allSales);
		return"sales";
	}
	
	
}
