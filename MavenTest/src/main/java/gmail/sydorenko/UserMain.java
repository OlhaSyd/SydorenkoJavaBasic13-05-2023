package gmail.sydorenko;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.print("Введіть логін: ");
            String login = scanner.next();

            System.out.print("Введіть пароль: ");
            String password = scanner.next();

            System.out.print("Підтвердження паролю: ");
            String confirmPassword = scanner.next();
            try {
                User user = new User(login, password, confirmPassword);
                break;

            } catch (WrongLoginException e) {
                System.out.println("wrong login!");

            } catch (WrongPasswordException e) {
                System.out.println("wrong password!");

            } finally {
                System.out.println("Дякую, що скористались нашим сервісом");
            }

        }
        System.out.println("Ви використали всі спроби!");
        scanner.close();
    }
}