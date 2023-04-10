package com.microservice.usermanagement.service;


import com.microservice.usermanagement.dao.ResponseDao;
import com.microservice.usermanagement.entity.User;
import com.microservice.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public ResponseDao authenticateUser(String email, String password) {
        ResponseDao resp = new ResponseDao("false", "error", null);
        User user = repository.findByEmail(email);
        if(password.equals(user.getPassword())){
            resp.setResponse("true");
            resp.setState("success");
            resp.setUser(user);
        }

        return resp;
    }

    @Override
    public ResponseDao saveUser(User user) {
        ResponseDao resp = new ResponseDao("false", "error", null);
        String userid = UUID.randomUUID().toString();
        user.setId(userid);
        repository.save(user);
        resp.setResponse("User Created");
        resp.setState("success");
        resp.setUser(user);
        return resp;
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
