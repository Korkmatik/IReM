package korkmatik.irem.backend.endpoints.v1;

import korkmatik.irem.backend.controllers.CustomerController;
import korkmatik.irem.backend.dtos.CustomerDTO;
import korkmatik.irem.backend.models.Customer;
import korkmatik.irem.backend.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerEndpoint {

    @Autowired
    CustomerController customerController;

    @GetMapping
    public HttpEntity<List<Customer>> getCustomers() {
        var customers = customerController.getCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public HttpEntity<Customer> getCustomer(@RequestParam int id) {
        Customer customer = customerController.getCustomerById(id);

        if (customer == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @PostMapping
    public HttpEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer createdCustomer = customerController.createCustomer(customer);
        return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public HttpEntity updateCustomer(@RequestBody Customer customer, @RequestParam int id) {
        Customer updatedCustomer = customerController.updateCustomer(id, customer);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public HttpEntity deleteCustomer(@RequestParam int id) {
        if (!customerController.deleteCustomerById(id)) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(HttpStatus.OK);
    }
}
