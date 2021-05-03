package korkmatik.irem.backend.controllers;

import korkmatik.irem.backend.dtos.CustomerDTO;
import korkmatik.irem.backend.models.Customer;
import korkmatik.irem.backend.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Customer updateCustomer(int id, Customer customer) {
        customer.setId(id);
        return customerRepository.save(customer);
    }

    public boolean deleteCustomerById(int id) {
       Optional<Customer> customer = customerRepository.findById(id);
       if (customer.isEmpty()) {
           return false;
       }

       customerRepository.delete(customer.get());
       return true;
    }
}
