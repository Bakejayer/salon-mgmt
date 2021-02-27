package com.bayer.salonmanagement.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
@Getter
@Setter
public class SalonService {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String name;

    double price;

    public SalonService() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalonService that = (SalonService) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
