package com.bayer.salonmanagement.service;

import com.bayer.salonmanagement.model.Appointment;
import com.bayer.salonmanagement.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppointmentService {

    public List<Appointment> findAll();

}
