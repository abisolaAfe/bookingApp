package com.mybookingApplication.New.Booking.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mybookingApplication.New.Booking.Application.Entities.Bookings;
@Repository
public interface BookingRepository  extends JpaRepository<Bookings,Long>{

}
