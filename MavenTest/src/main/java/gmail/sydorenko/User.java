package gmail.sydorenko;

import java.util.Objects;

import static java.lang.Character.isDigit;

public class User {
    final String login;
    final String password;
    final String confirmPassword;

    public User(String login, String password, String confirmPassword) {

        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;

        checkLogin(login);
        checkPassword(password);
        isPasswordMatch(password, confirmPassword);

    }

    public static void checkLogin(String array) {

        if (array == null || array.length() == 0 | array.length() >= 20) {
            throw new WrongLoginException("Wrong login!");
        } else {
            for (int i = 0; i < array.length(); i++) {
                char symbol = array.charAt(i);

                if (symbol < 'a' || symbol > 'z') {
                    throw new WrongLoginException("Wrong login!");
                }
            }
        }
    }

    public static void checkPassword(String array) {

        int countNumbers = 0;
        int countLetters = 0;

        if (array == null || array.length() < 6 | array.length() > 25) {
            throw new WrongPasswordException("wrong password!");
        }
        for (int i = 0; i < array.length(); i++) {
            char symbol = array.charAt(i);

            if (isDigit(symbol)) {
                countNumbers++;
            } else if (symbol >= 'a' && symbol <= 'z') {
                countLetters++;
            }
        }

        if (countNumbers == 0 | countLetters == 0) {

            throw new WrongPasswordException("wrong password!");
        }
    }

    public static void isPasswordMatch(String password, String confirmPassword) {
        if (password == null || confirmPassword == null) {
            return;
        }
        if (Objects.equals(password, confirmPassword)) {
            return;
        }
        throw new WrongPasswordException("Passwords not match!");
    }
}




