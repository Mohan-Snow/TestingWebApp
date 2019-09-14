package com.goalsachieved.repos;

import com.goalsachieved.models.Goal;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GoalRepo extends CrudRepository<Goal, Long> {

    @Override
    <S extends Goal> S save(S s);

    @Override
    Optional<Goal> findById(Long id);

    @Override
    void deleteById(Long id);
}
