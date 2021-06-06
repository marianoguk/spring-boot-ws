package org.coding.springboot.ws.rest.university.domain.service;

import lombok.extern.slf4j.Slf4j;
import org.coding.springboot.ws.rest.university.api.StudentDto;
import org.coding.springboot.ws.rest.university.api.mapper.StudentMapper;
import org.coding.springboot.ws.rest.university.domain.repository.StudentRepository;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class StudentService {
    private final StudentRepository repository;
    private final StudentMapper mapper;

    public StudentService(StudentRepository repository, StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<StudentDto> findAll() {
        return repository.findAll().stream()
                .map(mapper::map)
                .collect(Collectors.toList());
    }

    public StudentDto findById(Long id) {
        return mapper.map(repository.findById(id).orElse(null));
    }

    public StudentDto add(StudentDto dto) {
        try {
            return mapper.map(repository.save(mapper.map(dto)));
        } catch (Exception e) {
            log.error("Error during creation : {}", e.getMessage(), e);
            throw e;
        }
    }
}
