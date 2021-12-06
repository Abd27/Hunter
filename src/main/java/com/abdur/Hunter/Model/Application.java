package com.abdur.Hunter.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Application {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String companyName;

    public Application(String companyName){
        this.companyName = companyName;
    }

    public Application(){}

    public String getCompanyName(){
        return this.companyName;
    }

}
