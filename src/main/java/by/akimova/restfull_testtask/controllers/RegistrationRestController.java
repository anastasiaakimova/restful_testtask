package by.akimova.restfull_testtask.controllers;

import by.akimova.restfull_testtask.models.Role;
import by.akimova.restfull_testtask.models.User;
import by.akimova.restfull_testtask.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
    @Autowired
    private UserRepo userRepo;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String registration() {
        return "registration";
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
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
