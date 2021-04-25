package by.akimova.restfull_testtask.repository;

import by.akimova.restfull_testtask.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
