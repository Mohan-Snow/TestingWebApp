package com.goalsachieved.repos;

import com.goalsachieved.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<User, Long> {

    @Override
    <S extends User> S save(S s);

    @Override
    Optional<User> findById(Long aLong);

    @Override
    Iterable<User> findAll();

    @Override
    void deleteById(Long aLong);
}
