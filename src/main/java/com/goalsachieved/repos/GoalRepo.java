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

    @Override
    <S extends Goal> Iterable<S> saveAll(Iterable<S> iterable);

    @Override
    boolean existsById(Long aLong);

    @Override
    Iterable<Goal> findAll();

    @Override
    Iterable<Goal> findAllById(Iterable<Long> iterable);

    @Override
    long count();

    @Override
    void delete(Goal goal);

    @Override
    void deleteAll(Iterable<? extends Goal> iterable);

    @Override
    void deleteAll();
}
