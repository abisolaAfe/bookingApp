package com.mybookingApplication.New.Booking.Application.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mybookingApplication.New.Booking.Application.Entities.Bookings;
import com.mybookingApplication.New.Booking.Application.Entities.Cleaning;
import com.mybookingApplication.New.Booking.Application.Entities.Role;
import com.mybookingApplication.New.Booking.Application.Entities.Rooms;
import com.mybookingApplication.New.Booking.Application.Entities.Sales;
import com.mybookingApplication.New.Booking.Application.Entities.Workers;
import com.mybookingApplication.New.Booking.Application.repository.BookingRepository;
import com.mybookingApplication.New.Booking.Application.repository.CleaningRepository;
import com.mybookingApplication.New.Booking.Application.repository.RoomsRepository;
import com.mybookingApplication.New.Booking.Application.repository.SalesRepository;
import com.mybookingApplication.New.Booking.Application.repository.WorkersRepository;


@Service
@SessionAttributes("workerId")
public class BookingAppService {
	private SalesRepository saleRepo;
    private WorkersRepository workerRepo;
	private RoomsRepository roomRepo;
	private CleaningRepository cleaningRepo;
	private BookingRepository bookingRepo;
 //  private Workers worker;
//	public  BookingAppService() {
//		
//	}
	public BookingAppService(RoomsRepository roomRepo, WorkersRepository workerRepo,SalesRepository saleRepo,
			                                       CleaningRepository cleaningRepo,BookingRepository bookingRepo) {
		super();
		this.saleRepo = saleRepo;
        this.workerRepo = workerRepo;
		this.roomRepo = roomRepo;
		this.cleaningRepo = cleaningRepo;
		this.bookingRepo = bookingRepo;
     // this.worker = worker;
	}
	//String firstName, String lastName,String loginName,String password, String role
	public void addWorker(  String FirstName,  String LastName, String loginName, String password,String role){
   workerRepo.save(new Workers(FirstName,LastName,loginName,password,role));
	}
	
	public void addRoom(long roomNum,LocalDateTime roomTime) {	
		String pattern = "yyyy-MM-dd"; // Customize the pattern according to your desired format
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		roomRepo.save(new Rooms(roomNum,   roomTime.format(formatter)));
		}
	public List<Rooms> getAllRooms() {
		List<Rooms>allRooms = roomRepo.findAll() ;
		return allRooms;
	}
	public List<Bookings> getAllBookings() {
		List<Bookings>allBookings = bookingRepo.findAll() ;
		return allBookings;
	}
	public List<Sales> getAllSales(){
		List <Sales>allSales = saleRepo.findAll();
		return allSales;
	}
	
	public Workers getOneWorkerr(String Role) {
		
		Workers oneWorker = workerRepo.getWorkerByRole(Role); 
		 return oneWorker;
		
		}
	   public Rooms getOneRoom(Long roomNum) {
		 Rooms oneRoom = roomRepo.getById(roomNum); 
			return oneRoom;
		}
	   public Workers getWorkerById(long workerId) {
		Workers worker =workerRepo.getById(workerId);	  
		return worker;
	   }
	   
	   public Workers getWorkerByUserName(String loginName) {
		   
		 Workers worker=  workerRepo.getWorkerByLoginName( loginName);
		 return worker;
	   }
	   
	   public void addOneSales( Rooms room,String description, int price, int quantity,ModelMap model) {
		   double amount = price*quantity;
		   long id = (long) model.get("workerId");
		   String pattern = "yyyy-MM-dd"; // Customize the pattern according to your desired format
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		   saleRepo.save(new Sales(getWorkerById(id),room, description, price,quantity,LocalDateTime.now().format(formatter), amount));
	
     }
	   public void addCleaning(Rooms room, Workers worker,  LocalDateTime cleaningTime,boolean cleanStatus) {
		 
		
		   cleaningRepo.save(new Cleaning(room,worker,cleaningTime,cleanStatus))  ;
		   
	   }
	
	   public boolean loginverify(String loginName, String enterPassword) {
		
		Workers worker;
		boolean loginStatus;
		try {
			 worker = getWorkerByUserName(loginName); 
			 String password =  worker.getPassword();
			  if(enterPassword.equals(password)) {
					 return loginStatus =  true;
			  }
					 else { 
						 return loginStatus = false;
			  }
		}catch(Exception e) {
		return loginStatus = false;
		}
		
	  }	
	   //Rooms room, Workers worker,  LocalDateTime cleaningTime,boolean cleanStatus) {
	   public void updateCleaningStatus(Long roomNumber) {
		//Predicate<? super Rooms >predicate = room ;
		Rooms room = getOneRoom(roomNumber);
		room.setCleanStatus(true);
		roomRepo.save(room);
		
	   }
	 //  String guestFirstName, String guestLastName, String guestAddress, Rooms room,
	//	Workers worker, LocalDateTime checkingTime, LocalDateTime checkoutTime) 
	   public void addBooking(String guestFirstName, String guestLastName, String guestAddress, long roomNum, 
				                                 long duration,ModelMap model ) {
		  
		   long id = 0; 
		   id =  (long)model.get("workerId");
		   String pattern = "yyyy-MM-dd HH:mm:ss"; // Customize the pattern according to your desired format
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		   

		   bookingRepo.save(new Bookings(guestFirstName, guestLastName,guestAddress,getOneRoom(roomNum),getWorkerById(id),
				                             LocalDateTime.now().format(formatter),LocalDateTime.now().plusDays(duration).format(formatter)));
		   getOneRoom(roomNum).setBookingStatus(true);
		   roomRepo.save( getOneRoom(roomNum));
		   
	   }
		 public void cancelRoomBooking(long bookingId) {
			 Bookings booking =bookingRepo.getById(bookingId);
			Rooms room=	booking.getRoom();
			room.setBookingStatus(false);
			roomRepo.save(room);	 
			bookingRepo.delete(booking);
			
		 }
		
		 
		 
	}
