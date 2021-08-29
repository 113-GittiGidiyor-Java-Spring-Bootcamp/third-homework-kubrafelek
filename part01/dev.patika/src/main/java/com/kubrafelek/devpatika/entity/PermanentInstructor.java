package com.kubrafelek.devpatika.entity;

import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class PermanentInstructor extends Instructor{

    private double fixedSalary;
}
