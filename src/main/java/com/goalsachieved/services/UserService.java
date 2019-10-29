package com.goalsachieved.services;

import com.goalsachieved.models.Goal;
import com.goalsachieved.models.User;
import com.goalsachieved.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void add(User user) {
        System.out.println("SAVING a user in UserService");
        userRepo.save(user);
    }

    public void edit() {

    }

    public void delete(Long id) {

    }

    public Goal show(Long id) {
        return null;
    }

    public Iterable<Goal> getAll() {
        return null;
    }
}
