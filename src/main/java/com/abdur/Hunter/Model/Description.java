package com.abdur.Hunter.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "description")
public class Description {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String jobRole;
    private String location;
    private String salary;
    @OneToOne(mappedBy = "description")
    @JsonIgnore
    private Application application;
}
