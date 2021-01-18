package com.bayer.salonmanagement.repository;

import com.bayer.salonmanagement.model.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRespository extends CrudRepository<Appointment, Long> {
}
