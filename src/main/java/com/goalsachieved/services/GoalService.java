package com.goalsachieved.services;

import com.goalsachieved.models.Goal;
import com.goalsachieved.repos.GoalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoalService implements BasicService {

    @Autowired
    GoalRepo goalRepo;

    @Override
    public void add(Goal goal) {
        System.out.println("SAVING a goal in GoalService");
        goalRepo.save(goal);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete(Long id) {
        goalRepo.deleteById(id);
    }

    @Override
    public Goal show(Long id) {
        return goalRepo.findById(id).get();
    }

    @Override
    public Iterable<Goal> getAll() {
        return goalRepo.findAll();
    }
}
