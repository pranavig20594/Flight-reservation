package com.pranavi.flightreservation.flightreservation.controllers;

import com.pranavi.flightreservation.flightreservation.entities.User;
import com.pranavi.flightreservation.flightreservation.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/showReg")
    public String showRegistrationPage(){
        return "registerUser";
    }


    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/registerUser")
    public String registerUser(@ModelAttribute("User") User user, ModelMap modelMap){
        User user1 = userRepository.save(user);
        String msg = "User has been registered";
        modelMap.addAttribute("msg",msg);
        return "login";
    }

    @RequestMapping(value = "/loginUser",method = RequestMethod.POST)
    public String findUser(@RequestParam String email,@RequestParam String password,ModelMap map){
       User user = userRepository.findByEmail(email);
       if(user.getPassword().equals(password))
        return "findFlights";
       else
           map.addAttribute("msg","Invalid username/password");
        return  "login";
    }
}
