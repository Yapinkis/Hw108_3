package repository;

import model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    void addUser(User user);
    Optional<List<User>> getAllUsers();
    User getUserById
}
