package korkmatik.irem.backend.repositories;

import korkmatik.irem.backend.controllers.CustomerController;
import korkmatik.irem.backend.endpoints.v1.CustomerEndpoint;
import korkmatik.irem.backend.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
