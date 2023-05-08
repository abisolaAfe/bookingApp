package com.mybookingApplication.New.Booking.Application.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mybookingApplication.New.Booking.Application.Entities.Workers;
@Repository
public interface WorkersRepository extends JpaRepository<Workers, Long> {
	public Workers getWorkerByRole (String Role);
	public Workers getWorkerByLoginName (String loginName);
}

