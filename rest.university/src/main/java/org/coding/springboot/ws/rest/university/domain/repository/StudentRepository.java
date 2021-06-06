package org.coding.springboot.ws.rest.university.domain.repository;

import org.coding.springboot.ws.rest.university.domain.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
