package by.akimova.restfull_testtask.services;

import by.akimova.restfull_testtask.models.User;
import by.akimova.restfull_testtask.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepo userRepo;

    @Override
    public User getById(Long id) {
        return userRepo.findOne(id);
    }

    @Override
    public void save(User user) {
        userRepo.save(user);

    }

    @Override
    public void delete(Long id) {
        userRepo.delete(id);

    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }
}
