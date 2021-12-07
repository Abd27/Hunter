package com.abdur.Hunter.Controller;

import com.abdur.Hunter.Model.Application;
import com.abdur.Hunter.Service.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class ApplicationController {
    private ApplicationService applicationService;

    @PostMapping("/newApplication")
    public void createApplication(@RequestBody Application application){
        applicationService.createApplication(application);
    }

    @GetMapping("/applications")
    public List<Application> listApplications(){
        return applicationService.listAllApplications();
    }
}
