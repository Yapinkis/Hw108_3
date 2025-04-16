package service;

import model.UserDTO;
import util.Validator;

import java.util.Scanner;

public class UserService {
    Scanner scanner = new Scanner(System.in);
    public void createUser() {
        System.out.println("Введите имя пользователя");
        System.out.println("Допустимое число символов ввода от 3 до 100 символов");
        String name = scanner.nextLine();

        System.out.println("Введите почту пользователя");
        System.out.println("Почта должна содержать символа @");
        String email = scanner.nextLine();

        System.out.println("Введите возраст пользователя");
        System.out.println("Допустимый возраст пользователя от 8 до 99 лет");
        Integer age = scanner.nextInt();

        UserDTO userDTO = UserDTO.builder().name(name).email(email).age(age).build();
        Validator.validateUser(userDTO);

    }
}
