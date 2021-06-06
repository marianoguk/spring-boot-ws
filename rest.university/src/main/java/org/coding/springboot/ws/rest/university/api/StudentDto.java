package org.coding.springboot.ws.rest.university.api;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentDto {
    private Long id;
    private String firstName;
    private String lastName;
}
