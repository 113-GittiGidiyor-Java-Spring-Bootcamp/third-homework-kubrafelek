package com.kubrafelek.devpatika.service;

import com.kubrafelek.devpatika.entity.Instructor;
import com.kubrafelek.devpatika.entity.PermanentInstructor;
import com.kubrafelek.devpatika.entity.Student;
import com.kubrafelek.devpatika.entity.VisitingResearcher;
import com.kubrafelek.devpatika.repository.InstructorRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InstructorService implements BaseService<Instructor> {

    private final InstructorRepository instructorRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Instructor> findAll() {
        List<Instructor> instructorList = new ArrayList<>();
        Iterable<Instructor> instructorIterable = instructorRepository.findAll();
        instructorIterable.iterator().forEachRemaining(instructorList::add);
        return instructorList;
    }

    @Override
    @Transactional(readOnly = true)
    public Instructor findById(int id) {
        return instructorRepository.findById(id).get();
    }

    @Override
    public Instructor save(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    public Instructor savePermanentInstructor(PermanentInstructor permanentInstructor) {
        return null;
    }

    public Instructor saveVisitingResearcher(VisitingResearcher visitingResearcher) {
        return null;
    }

    @Override
    @Transactional
    public Instructor update(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        instructorRepository.deleteById(id);
    }
}
