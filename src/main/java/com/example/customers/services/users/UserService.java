package com.example.customers.services.users;

import com.example.customers.entities.User;
import com.example.customers.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IuserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        List listUsers = new ArrayList<>();
        Iterable<User> list = userRepository.findAll();
        for (User usr : list) {
            listUsers.add((usr));
        }
        return listUsers;
    }

    @Override
    public User getUser(Integer id) {
        return null;
    }

    @Override
    public void createUser(User user) {
         userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        return;
    }

    @Override
    public void updateUser(Integer id, User user) {
        return;
    }
}
