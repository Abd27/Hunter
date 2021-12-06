package com.abdur.Hunter.Service;


import com.abdur.Hunter.Model.Application;
import com.abdur.Hunter.Repository.ApplicationRepository;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    private ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public void createApplication(Application application){
        applicationRepository.save(application);
    }
}
