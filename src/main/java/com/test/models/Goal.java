package com.test.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private GoalType type;

    private List<String> notes = new ArrayList<>();

    @OneToMany(mappedBy = "goals")
    private AppUser user;

    public Goal() {
    }

    public Goal(String description, GoalType type, AppUser user) {
        this.description = description;
        this.type = type;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public GoalType getType() {
        return type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(GoalType type) {
        this.type = type;
    }
}
