import model.UserDTO;
import repository.UserRepository;
import repository.UserRepositoryImpl;
import service.UserService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRepository userRepository = new UserRepositoryImpl();
        UserService userService = new UserService(scanner, userRepository);
        while (true) {
            System.out.println("Выберете команду");
            System.out.println(" " +
                    "\n 1 - Добавить пользователя" +
                    "\n 2 - Показать список всех пользователей" +
//                    "\n 3 - Удалить задачу" +
//                    "\n 4 - Удалить все азадчи" +
//                    "\n 5 - Маркировать задачу как выполненную" +
                    "\n 6 - Завершить программу");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {
                case 1:
                    userService.createUser();
                    break;
                case 2:
                    userService.getAllUsers().forEach(System.out::println);
                    break;
            }
        }
    }
}
