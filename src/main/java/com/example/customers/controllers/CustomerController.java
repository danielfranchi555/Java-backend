package com.example.customers.controllers;

import com.example.customers.entities.Customer;
import com.example.customers.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerService service;


    @GetMapping("/customer")//
    public List<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/customer/{id}")// OBTENER CUSTOMER POR ID
    public Customer getCustomer(@PathVariable Integer id) {
        return service.getCustomer(id);
    }

    @DeleteMapping("/customer/{id}") // ELIMINAR UN CUSTOMER
    public void deleteCustomer(@PathVariable Integer id) {
        service.deleteCustomer(id);
    }

    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer customer) {
        service.addCustomer(customer);
    }

    @PutMapping("/customer/{id}")
    public void updateCustomer(@PathVariable Integer id, @RequestBody Customer customer) {
        service.updateCustomer(customer, id);
    }

    // SEARCH
    @GetMapping("/customer/search")
    public List<Customer> searchCustomer(@RequestParam(value = "lastname", required = false) String lastname, @RequestParam(value = "name" ,required = false) String name) {
        return service.searchCustomer(lastname, name);
    }

}

