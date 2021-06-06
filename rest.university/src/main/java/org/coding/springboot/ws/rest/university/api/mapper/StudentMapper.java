package org.coding.springboot.ws.rest.university.api.mapper;

import org.coding.springboot.ws.rest.university.api.StudentDto;
import org.coding.springboot.ws.rest.university.domain.model.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentDto map(Student source);
    Student map(StudentDto source);
}
