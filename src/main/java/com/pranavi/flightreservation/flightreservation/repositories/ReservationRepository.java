package com.pranavi.flightreservation.flightreservation.repositories;

import com.pranavi.flightreservation.flightreservation.entities.Reservation;
import com.pranavi.flightreservation.flightreservation.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
