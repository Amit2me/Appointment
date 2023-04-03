package com.javabros.springbootjpademo1.service;

import com.javabros.springbootjpademo1.model.Appointment;
import com.javabros.springbootjpademo1.repository.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepo appointmentRepo;
    public Appointment saveAppointment(Appointment appointment){
       return appointmentRepo.save(appointment);
    }


}
