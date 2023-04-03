package com.javabros.springbootjpademo1.controller;

import com.javabros.springbootjpademo1.model.Appointment;
import com.javabros.springbootjpademo1.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/add")
    ResponseEntity <Appointment> addAppointment(@RequestBody Appointment appointment){
      return new ResponseEntity<>(appointmentService.saveAppointment(appointment), HttpStatus.CREATED)  ;
    }
}
