package com.bayer.salonmanagement.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Appointment {
    private Date appointmentDate;
    private String Name;
    List<SalonService> services;
    double total;
}
