package by.akimova.restfull_testtask.controllers;

import by.akimova.restfull_testtask.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index")
public class GreetingRestController {

    private final UserRepo userRepo;

    @Autowired
    public GreetingRestController(UserRepo userRepo){
        this.userRepo = userRepo;
    }
    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String greeting(
            @RequestParam(name = "name", required = false) String name
    ) {
        return "index";
    }
}