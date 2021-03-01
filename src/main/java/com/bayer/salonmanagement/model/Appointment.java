package com.bayer.salonmanagement.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table
@Getter
@Setter
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private Date appointmentDate;

    @Pattern(regexp = "^(0[0-9])|(1[0-2]):[0-5][0-9] (A|P)M",
    message = "Enter time in 00:00 AM/PM format")
    private String appointmentTime;

    private String customerFirstName;

    private String customerLastName;

    @OneToMany
    List<SalonService> services;

    double total;

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", appointmentDate=" + appointmentDate +
                ", Name='" + Name + '\'' +
                ", services=" + services +
                ", total=" + total +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
