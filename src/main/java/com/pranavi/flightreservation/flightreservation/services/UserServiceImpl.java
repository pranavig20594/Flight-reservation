package com.pranavi.flightreservation.flightreservation.services;

import com.pranavi.flightreservation.flightreservation.entities.User;
import com.pranavi.flightreservation.flightreservation.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean findUser(User user) {
      //  userRepository.
        return false;
    }
}
