package com.test.repos;

import com.test.models.Goal;
import org.springframework.data.repository.CrudRepository;

public interface GoalRepository extends CrudRepository<Goal, Long> {
}
