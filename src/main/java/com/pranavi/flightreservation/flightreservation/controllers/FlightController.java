package com.pranavi.flightreservation.flightreservation.controllers;

import com.pranavi.flightreservation.flightreservation.entities.Flight;
import com.pranavi.flightreservation.flightreservation.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class FlightController {

    @Autowired
    FlightRepository flightRepository;

    @RequestMapping("/findFlights")
    public String findFlights(@RequestParam String departureCity,
                              @RequestParam String arrivalCity,
                              @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateOfDeparture,
                              ModelMap modelMap){
        System.out.println("Date = "+dateOfDeparture);
        List<Flight> flights =flightRepository.findFLights(departureCity,arrivalCity,dateOfDeparture);
        System.out.println(flights);
        modelMap.addAttribute("flights",flights);
        return "displayFlights";
    }

    @RequestMapping("/showCompleteReservation")
    public void showCompleteReservation(Long id){

    }
}
