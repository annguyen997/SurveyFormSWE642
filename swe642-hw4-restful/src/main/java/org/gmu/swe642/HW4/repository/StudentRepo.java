package org.gmu.swe642.HW4.repository;

import org.gmu.swe642.HW4.domain.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Long> {
    Student findByStdid(String stdid);
}