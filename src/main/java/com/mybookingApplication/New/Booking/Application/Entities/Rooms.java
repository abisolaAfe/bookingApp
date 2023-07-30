package com.mybookingApplication.New.Booking.Application.Entities;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Builder
public class Rooms {

	
		@Id
	private Long roomNumber;
	private String roomAvailableTime;
	private boolean bookingStatus;
	private boolean cleanStatus;

	@OneToOne(mappedBy= "room")
	private Bookings bookings;

	@OneToOne(mappedBy= "room")
	private Cleaning cleaning;
	
	

//	@OneToOne(mappedBy= "room")
//	private Bookings booking;

	public Rooms() {}
	public Rooms(long roomNumber, String  roomAvailableTime ) {
		super();
		this.roomNumber = roomNumber;
		this. roomAvailableTime =  roomAvailableTime;
		this.bookingStatus = bookingStatus;
		this.cleanStatus = cleanStatus;;
	}
	public long getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(long roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomAvailableTime() {
		return roomAvailableTime;
	}
	public void setRoomAvailableTime(String roomAvailableTime) {
		this.roomAvailableTime = roomAvailableTime;
	}
	public boolean isBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public boolean isCleanStatus() {
		return cleanStatus;
	}
	public void setCleanStatus(boolean cleanStatus) {
		this.cleanStatus = cleanStatus;
	}
	


	}

