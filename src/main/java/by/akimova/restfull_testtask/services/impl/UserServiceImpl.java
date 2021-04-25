package by.akimova.restfull_testtask.services.impl;

import by.akimova.restfull_testtask.models.User;
import by.akimova.restfull_testtask.repository.UserRepo;
import by.akimova.restfull_testtask.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
   private final UserRepo userRepo;

   @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User getById(Long id) {
        return userRepo.getOne(id);
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }
}