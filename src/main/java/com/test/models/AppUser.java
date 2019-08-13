package com.test.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@Table(name = "users")
@Entity // This tells Hibernate to make a table out of this class
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ElementCollection(targetClass = Goal.class, fetch = FetchType.EAGER)
    @JoinTable(name = "user_goals",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "goal_id"))
    private Set<Goal> goals;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
