import model.UserDTO;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберете команду");
            System.out.println(" " +
                    "\n 1 - Добавить пользователя" +
//                    "\n 2 - Показать список задач" +
//                    "\n 3 - Удалить задачу" +
//                    "\n 4 - Удалить все азадчи" +
//                    "\n 5 - Маркировать задачу как выполненную" +
                    "\n 6 - Завершить программу");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {

                case 1:
                    AddUser
            }
        }
    }
}
