package com.goalsachieved.services;

import com.goalsachieved.models.Goal;

public interface BasicService {

    void add(Goal goal);

    void edit();

    void delete(Long id);

    Goal show(Long id);

    Iterable<Goal> getAll();

}
