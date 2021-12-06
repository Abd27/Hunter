package com.abdur.Hunter.Repository;

import com.abdur.Hunter.Model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

}
