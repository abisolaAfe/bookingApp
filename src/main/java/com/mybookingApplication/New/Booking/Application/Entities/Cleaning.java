package com.mybookingApplication.New.Booking.Application.Entities;

import java.time.LocalDateTime;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cleaning {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long cleaningId ;	

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = " FK_Room_Id")
private Rooms room;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = " FK_Worker_Id")
private Workers worker;
private boolean cleanStatus;
private LocalDateTime cleaningTime;

public Cleaning() {}	

public Cleaning(Rooms room, Workers worker,  LocalDateTime cleaningTime,boolean cleanStatus) {
		super();
		this.room = room;
		this.worker = worker;
		this.cleanStatus =cleanStatus ;
		this.cleaningTime = cleaningTime;
	}
	
	
	
	
}
