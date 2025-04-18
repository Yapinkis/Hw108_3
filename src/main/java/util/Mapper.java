package util;

import lombok.Builder;
import model.User;
import model.UserDTO;

import java.time.LocalDateTime;
import java.util.Optional;
@Builder
public class Mapper {
    public static User toUser(UserDTO userDTO) {
        return User.builder().name(userDTO.getName()).
                email(userDTO.getEmail()).
                age(userDTO.getAge()).
                createdAt(LocalDateTime.now()).
                build();
    }

    public static UserDTO toUserDTO(User user) {
        return UserDTO.builder().name(user.getName()).
                email(user.getEmail()).
                age(user.getAge()).
                createdAt(user.getCreatedAt()).
                build();
    }
}
