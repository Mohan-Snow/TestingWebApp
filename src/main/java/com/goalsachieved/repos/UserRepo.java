package com.goalsachieved.repos;

import com.goalsachieved.models.AppUser;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<AppUser, Long> {

    @Override
    <S extends AppUser> S save(S s);

    @Override
    Optional<AppUser> findById(Long aLong);

    @Override
    Iterable<AppUser> findAll();

    @Override
    void deleteById(Long aLong);
}
