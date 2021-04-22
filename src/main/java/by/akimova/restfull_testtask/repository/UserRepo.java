package by.akimova.restfull_testtask.repository;

import by.akimova.restfull_testtask.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
