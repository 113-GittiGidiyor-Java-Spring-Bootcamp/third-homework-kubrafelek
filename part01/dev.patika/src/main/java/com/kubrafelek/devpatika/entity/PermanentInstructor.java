package com.kubrafelek.devpatika.entity;

import lombok.*;

@Data
@RequiredArgsConstructor
public class PermanentInstructor extends Instructor{

    private double fixedSalary;
}
