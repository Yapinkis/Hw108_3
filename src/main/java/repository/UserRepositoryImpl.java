package repository;

import model.User;
import model.UserDTO;
import util.Mapper;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public void addUser(UserDTO userDTO) {
        User user = Mapper.toUser(userDTO);

    }
}
