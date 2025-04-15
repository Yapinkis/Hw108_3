package service;

import java.util.Scanner;

public class AddUser {
    Scanner scanner = new Scanner(System.in);
    public void createUser() {
        System.out.println("Введите имя пользователя");
        String name = scanner.nextLine();
    }
}
