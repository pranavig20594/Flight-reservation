package com.pranavi.flightreservation.flightreservation.repositories;

import com.pranavi.flightreservation.flightreservation.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String Email);

}
