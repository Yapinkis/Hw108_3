package repository;

import model.User;
import model.UserDTO;

public interface UserRepository {
    void addUser(UserDTO userDTO);
}
