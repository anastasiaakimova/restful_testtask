package by.akimova.restfull_testtask.controllers;

import by.akimova.restfull_testtask.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/index")
    public String greeting(
            @RequestParam(name = "name", required = false) String name
    ) {
        return "index";
    }
}