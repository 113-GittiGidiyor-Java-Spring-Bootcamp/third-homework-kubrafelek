package com.kubrafelek.devpatika.entity;

import lombok.*;

import java.util.List;

@Data
@RequiredArgsConstructor
public class VisitingResearcher extends Instructor{

    private double hourlySalary;

    public VisitingResearcher(int id, String name, String address, String phoneNumber, List<Course> courseList, double hourlySalary) {
        super(id, name, address, phoneNumber, courseList);
        this.hourlySalary = hourlySalary;
    }
}
