package com.goalsachieved.controllers;

import com.goalsachieved.models.AppUser;
import com.goalsachieved.models.Goal;
import com.goalsachieved.models.GoalType;
import com.goalsachieved.services.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoalController {

    private BasicService basicService;

    @Autowired
    public GoalController(@Qualifier("goalService") BasicService basicService) {
        this.basicService = basicService;
    }

    @GetMapping("/demo")
    public String addGoal(@RequestParam String description,
                          @RequestParam AppUser user,
                          @RequestParam String type,
                          Model model) {
        GoalType gType;
        if (type.equals("sub")) {
            gType = GoalType.SUB_GOAL;
        } else if (type.equals("main")) {
            gType = GoalType.MAIN_GOAL;
        } else {
            return "error_page";
        }
        basicService.add(new Goal(description, gType, user));
        return "demo";
    }
}
