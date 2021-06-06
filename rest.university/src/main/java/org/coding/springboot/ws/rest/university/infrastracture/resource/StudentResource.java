package org.coding.springboot.ws.rest.university.infrastracture.resource;

import org.coding.springboot.ws.rest.university.api.StudentDto;
import org.coding.springboot.ws.rest.university.domain.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentResource {

    private final StudentService service;

    public StudentResource(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<StudentDto> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public StudentDto findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public StudentDto add(@RequestBody StudentDto dto) {
        return service.add(dto);
    }
}
