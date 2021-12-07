package com.abdur.Hunter.Service;


import com.abdur.Hunter.Model.Application;
import com.abdur.Hunter.Repository.ApplicationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ApplicationService {

    private ApplicationRepository applicationRepository;

    public void createApplication(Application application){
        applicationRepository.save(application);
    }

}
