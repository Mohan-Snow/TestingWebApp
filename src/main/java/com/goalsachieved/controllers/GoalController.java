package com.goalsachieved.controllers;

import com.goalsachieved.models.AppUser;
import com.goalsachieved.models.Goal;
import com.goalsachieved.models.GoalType;
import com.goalsachieved.services.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GoalController {

    private BasicService service;

    @Autowired
    public GoalController(@Qualifier("goalService") BasicService basicService) {
        this.service = basicService;
    }

    @GetMapping("/test")
    public String test() {
        return "demo";
    }

    @PostMapping("/test")
    public String addGoal(@RequestParam String description,
                          @RequestParam String goalType,
                          @RequestParam String userName,
                          Map<String, Object> model) {

        // for setting the state
        GoalType gType;
        if (goalType.equals("sub")) {
            gType = GoalType.SUB_GOAL;
        } else if (goalType.equals("main")) {
            gType = GoalType.MAIN_GOAL;
        } else {
            return "error_page";
        }
        service.add(new Goal(description, gType, new AppUser(userName)));

        // for mapping
        Iterable<Goal> goals = service.getAll();
        model.put("goals", goals);
//        return "redirect:/";
        return "demo";
    }
}
