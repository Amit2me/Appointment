package com.javabros.springbootjpademo1.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "appointment_id", nullable = false)
    private Long appointmentId;

    private String userId;

}
