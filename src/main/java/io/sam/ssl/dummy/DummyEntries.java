package io.sam.ssl.dummy;

import io.sam.ssl.models.EmployeeAuthorization;
import io.sam.ssl.models.repositories.EmployeeAuthorizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DummyEntries {

    @Autowired
    private EmployeeAuthorizationRepository employeeAuthorizationRepository;

    @Bean
    public void saveUsersInTheDatabase() {
        employeeAuthorizationRepository.save(new EmployeeAuthorization("User1"
                , "user1@test.com"
                , "user1"
                , "ADMIN"));
        employeeAuthorizationRepository.save(new EmployeeAuthorization("User2"
                , "user2@test.com"
                , "user2"
                , "USER"));
        employeeAuthorizationRepository.save(new EmployeeAuthorization("User3"
                , "user3@test.com"
                , "user3"
                , "ADMIN"));
        employeeAuthorizationRepository.save(new EmployeeAuthorization("User4"
                , "user4@test.com"
                , "user4"
                , "ADMIN"));
        employeeAuthorizationRepository.save(new EmployeeAuthorization("User5"
                , "user5@test.com"
                , "user5"
                , "USER"));
    }
}
