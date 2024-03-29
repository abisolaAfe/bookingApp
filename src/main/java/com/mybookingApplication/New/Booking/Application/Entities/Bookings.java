package com.mybookingApplication.New.Booking.Application.Entities;



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
public class Bookings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long bookingId;
    private String guestFirstName;
    private String guestLastName;
    private String guestAddress;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = " FK_Rm_Id")
    private Rooms room;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = " FK_Worker_Id")
	private Workers worker;
	private String checkingTime;
	private String checkOutTime;
	public Bookings() {}
	
	public Bookings( String guestFirstName, String guestLastName, String guestAddress, Rooms room,
			Workers worker, String checkingTime,  String checkOutTime) {
		super();
		this.guestFirstName = guestFirstName;
		this.guestLastName = guestLastName;
		this.guestAddress = guestAddress;
		this.room = room;
		this.worker = worker;
		this.checkingTime = checkingTime;
		this.checkOutTime = checkOutTime;
	}

	public String getGuestFirstName() {
		return guestFirstName;
	}
	
  public Rooms getRoom() {
		return room;
	}
  public void setRoom(Rooms room) {
		 this.room = room;
	}
   public Workers getWorker() {
		return worker;
	}
   public void setWorker(Workers worker) {
		this.worker = worker;
	}
   public long getbookingId() {
	   return bookingId;
   }


	public void setGuestFirstName(String guestFirstName) {
		this.guestFirstName = guestFirstName;
	}

	public String getGuestLastName() {
		return guestLastName;
	}

	public void setGuestLastName(String guestLastName) {
		this.guestLastName = guestLastName;
	}

	public String getGuestAddress() {
		return guestAddress;
	}

	public void setGuestAddress(String guestAddress) {
		this.guestAddress = guestAddress;
	}

	public String getCheckingTime() {
		return checkingTime;
	}

	public void setCheckingTime(String checkingTime) {
		this.checkingTime = checkingTime;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	
	
	
	
	
	
	
	
	
}
