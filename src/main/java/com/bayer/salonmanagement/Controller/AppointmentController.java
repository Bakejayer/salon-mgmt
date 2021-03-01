package com.bayer.salonmanagement.Controller;

import com.bayer.salonmanagement.model.Appointment;
import com.bayer.salonmanagement.repository.AppointmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/appointments")
@SessionAttributes("appointment")
public class AppointmentController {

    AppointmentRepository appointmentRepository;

    public AppointmentController(AppointmentRepository appointmentRepository){
        this.appointmentRepository = appointmentRepository;
    }

    @GetMapping
    public String showAppointmentForm(Model model){


        return "appointments";
    }

    @GetMapping("/all")
    public String showAllAppointments(Model model){
        List<Appointment> appointmentList = (List<Appointment>)appointmentRepository.findAll().;
        model.addAllAttributes(appointmentList);

        return "all";
    }

    @PostMapping
    public String processAppointment(@Valid Appointment appointment, Error errors){

        return "redirect:/";
    }
}
