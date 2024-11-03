package com.example.customers.services.users;

import com.example.customers.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IuserService {
    public List <User> getUsers();
    public User getUser(Integer id);
    public void createUser(User user);
    public void deleteUser(Integer id);
    public void updateUser(Integer id, User user);

}
