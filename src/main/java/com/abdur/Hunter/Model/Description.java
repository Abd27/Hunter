package com.abdur.Hunter.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Description {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String jobRole;
    private String location;
    private String salary;
    @OneToOne(mappedBy = "description")
    private Application application;

    public Description(String jobRole, String location, String salary) {
        this.jobRole = jobRole;
        this.location = location;
        this.salary = salary;
    }
}
