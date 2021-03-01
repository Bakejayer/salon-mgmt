package com.bayer.salonmanagement.service;

import com.bayer.salonmanagement.model.Appointment;
import com.bayer.salonmanagement.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService{

    private final AppointmentRepository appointmentRepo;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepo)
    {
        this.appointmentRepo = appointmentRepo;
    }

    public List<Appointment> findAll(){
        List<Appointment> appointments = new ArrayList<>();
        appointmentRepo.findAll().iterator().forEachRemaining(appointments::add);
        return appointments;
    }
}
