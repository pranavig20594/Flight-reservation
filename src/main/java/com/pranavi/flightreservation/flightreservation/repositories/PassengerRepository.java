package com.pranavi.flightreservation.flightreservation.repositories;

import com.pranavi.flightreservation.flightreservation.entities.Passenger;
import com.pranavi.flightreservation.flightreservation.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {
}
