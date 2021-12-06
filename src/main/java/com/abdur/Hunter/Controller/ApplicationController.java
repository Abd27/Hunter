package com.abdur.Hunter.Controller;

import com.abdur.Hunter.Model.Application;
import com.abdur.Hunter.Service.ApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    private ApplicationService applicationService;
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping("/newApplication")
    public void createApplication(@RequestBody Application application){
        applicationService.createApplication(application);
    }
}
