package by.akimova.restfull_testtask.controllers;

import by.akimova.restfull_testtask.models.Role;
import by.akimova.restfull_testtask.models.User;
import by.akimova.restfull_testtask.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;

@Controller
public class RegistrationController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user) {
        User userFromDb = userRepo.findByUsername(user.getUsername());
        //проверка на существование юзера
        if (userFromDb != null) {
//            model.put("message", "User exists!");
//            return "registration";
        }
        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        userRepo.save(user);

        return "redirect:/login";
    }
}
