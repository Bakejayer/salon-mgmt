package com.bayer.salonmanagement.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Date;
import java.util.List;

@Data
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;

    private Date appointmentDate;
    private String Name;
    List<SalonService> services;
    double total;
}
