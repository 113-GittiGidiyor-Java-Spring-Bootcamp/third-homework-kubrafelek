package com.kubrafelek.devpatika.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class PermanentInstructor {

    @Id
    private double fixedSalary;
}
