package by.akimova.restfull_testtask.services;

import by.akimova.restfull_testtask.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User getById(Long id);
    void save(User user);
    void delete(Long id);
    List<User> getAll();
}
