package org.yup.OnlineStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.yup.OnlineStore.models.Customer;
import org.yup.OnlineStore.services.CustomerService;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("api/customer")
    public List<Customer> getAllCustomers(){
        return this.customerService.getAllCustomers();
    }

    @PostMapping("api/customer")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Customer createCustomer(@RequestBody Customer customer){
        return this.customerService.createCustomer(customer);
    }

    @GetMapping("api/customer/{id}")
    public Customer getCustomerById(@PathVariable Long Id){
        return this.customerService.getCustomerById(Id);
    }

    @GetMapping("api/customer/name")
    public Customer getCustomerByName(@RequestParam("name") String name){
        return this.customerService.getCustomerByName(name);
    }

    @DeleteMapping("api/customer/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable Long Id){
        this.customerService.deleteCustomer(Id);
    }

    @PutMapping("api/customer/{id}")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable Long Id){
        return this.customerService.updateCustomer(customer, Id);
    }
}
