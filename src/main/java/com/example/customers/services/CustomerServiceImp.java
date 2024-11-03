package com.example.customers.services;

import com.example.customers.entities.Customer;
import com.example.customers.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerRepository repository;


    public List<Customer> getAllCustomers() {
        List <Customer> listaCustomers = new ArrayList<>();
        Iterable<Customer> lista = repository.findAll();
        for (Customer c : lista){
            listaCustomers.add(c);
        }
        return listaCustomers;
    }

    public Customer getCustomer(Integer id) {
       Optional<Customer> customer = repository.findById(id);
       if(customer.isPresent()){
           return customer.get();
       }

       return  null;
    }

    public void deleteCustomer(Integer id) {
        repository.deleteById(id);
    }

    public void addCustomer(Customer customer) {
        repository.save(customer);
    }
    public void updateCustomer(Customer customer , Integer id) {
        customer.setId(id);
        repository.save(customer);
    }

    @Override
    public List<Customer> searchCustomer(String lastname, String name) {
        return repository.findByLastnameOrName(lastname,name);
    }




}
