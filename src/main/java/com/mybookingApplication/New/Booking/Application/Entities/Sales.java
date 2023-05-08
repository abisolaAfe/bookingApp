package com.mybookingApplication.New.Booking.Application.Entities;

import java.time.LocalDateTime;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Builder
public class Sales {

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = " FK_Worker_Id"  ) //, referencedColumnName ="salesId" 
	private Workers worker;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = " FK_Roomr_Id")
	private Rooms room;


	private String itemDescription;
	private int price;
	private int quantity;
	private double amount;
	private LocalDateTime timeOfSales;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long salesId;


	public Sales() {}


	public Sales(Workers worker, Rooms room, String itemDescription, 
			               int price, int quantity, LocalDateTime timeOfSales,double amount) {
		super();
		this.worker = worker;
		this.room = room;
		this.itemDescription = itemDescription;
		this.price = price;
		this.quantity = quantity;
		this.timeOfSales = timeOfSales;
		this.amount = amount;
	}
	public Sales(Workers worker, String itemDescription, int price, int quantity, LocalDateTime timeOfSales,double amount) {
super();
this.worker = worker;
this.itemDescription = itemDescription;
this.price = price;
this.quantity = quantity;
this.timeOfSales = timeOfSales;
this.amount = amount;
}


	public Workers getWorker() {
		return worker;
	}


	public void setWorker(Workers worker) {
		this.worker = worker;
	}


	public Rooms getRoom() {
		return room;
	}


	public void setRoom(Rooms room) {
		this.room = room;
	}


	public String getItemDescription() {
		return itemDescription;
	}


	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public LocalDateTime getTimeOfSales() {
		return timeOfSales;
	}


	public void setTimeOfSales(LocalDateTime timeOfSales) {
		this.timeOfSales = timeOfSales;
	}


	public long getSalesId() {
		return salesId;
	}


	public void setSalesId(long salesId) {
		this.salesId = salesId;
	}


}
