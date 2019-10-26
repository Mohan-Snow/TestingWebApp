package com.goalsachieved.models;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private GoalType type;

    @Autowired
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Goal() {
    }

    public Goal(String description, GoalType type, User user) {
        this.description = description;
        this.type = type;
        this.user = user;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public GoalType getType() {
        return type;
    }
    public void setType(GoalType type) {
        this.type = type;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
