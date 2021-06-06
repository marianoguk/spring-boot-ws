package org.coding.springboot.ws.rest.university.infrastracture.config;

import org.coding.springboot.ws.rest.university.api.mapper.StudentMapper;
import org.coding.springboot.ws.rest.university.domain.repository.StudentRepository;
import org.coding.springboot.ws.rest.university.domain.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public StudentService studentService(StudentRepository repo,StudentMapper mapper) {
        return new StudentService(repo, mapper);
    }
}
