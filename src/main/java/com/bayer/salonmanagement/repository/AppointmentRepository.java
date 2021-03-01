package com.bayer.salonmanagement.repository;

import com.bayer.salonmanagement.model.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

    List<Appointment> findAppointmentsByDate();

    List<Appointment> findAppointmentByLastName();

}
