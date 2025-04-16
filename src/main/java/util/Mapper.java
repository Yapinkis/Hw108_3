package util;

import model.User;
import model.UserDTO;

import java.time.LocalDateTime;
import java.util.Optional;

public class Mapper {
    public static User toUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setAge(userDTO.getAge());
        user.setCreatedAt(LocalDateTime.now());
        return user;
    }
}
