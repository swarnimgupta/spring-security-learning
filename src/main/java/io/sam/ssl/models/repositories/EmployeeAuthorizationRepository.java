package io.sam.ssl.models.repositories;

import io.sam.ssl.models.EmployeeAuthorization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeAuthorizationRepository extends JpaRepository<EmployeeAuthorization, Integer> {
}
