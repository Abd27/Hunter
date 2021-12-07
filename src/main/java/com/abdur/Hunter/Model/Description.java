package com.abdur.Hunter.Model;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity
public class Description {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String jobRole;
    private String location;
    private String salary;


    public Description(String jobRole, String location, String salary) {
        this.jobRole = jobRole;
        this.location = location;
        this.salary = salary;
    }
}
