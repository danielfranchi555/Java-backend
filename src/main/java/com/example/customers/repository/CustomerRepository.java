package com.example.customers.repository;

import com.example.customers.entities.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    // INSERTAR HQL QUE ESTA REFERIDO A LAS CLASES NO A TABLAS
    @Query("SELECT c FROM  Customer c WHERE lastname LIKE %:lastname% OR name LIKE %:name%")
    List<Customer> findByLastnameOrName(@Param("lastname") String lastname,@Param("name") String name);

}
