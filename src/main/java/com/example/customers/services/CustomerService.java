package com.example.customers.services;

import com.example.customers.entities.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getAllCustomers(); // TRAER TODOS LOS CUSTOMERS
    public Customer getCustomer( Integer id); // TRAER UN SOLO CUSTOMER
    public void deleteCustomer( Integer id); // ELIMINAR UN CUSTOMER
    public void addCustomer( Customer customer); // AGREGAR UN CUSTOMER
    public  void updateCustomer(Customer customer , Integer id);
    public List<Customer> searchCustomer(String lastname, String name);
}
