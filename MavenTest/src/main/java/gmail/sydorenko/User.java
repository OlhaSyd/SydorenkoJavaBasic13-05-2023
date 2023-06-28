package gmail.sydorenko;

import java.util.Objects;

import static java.lang.Character.isDigit;

public class User {
    final private String login;
    final private String password;
    final private String confirmPassword;

    public User(String login, String password, String confirmPassword) {

        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;

        checkLogin(login);
        checkPassword(password);
        isPasswordMatch(password, confirmPassword);

    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    static void checkLogin(String array) {

        if (array == null || array.length() == 0 | array.length() >= 20) {
            throw new WrongLoginException("Wrong login!");
        } else {
            for (int i = 0; i < array.length(); i++) {
                char symbol = array.charAt(i);

                if (symbol < 'A' || symbol > 'Z' & symbol < 'a' || symbol > 'z') {
                    throw new WrongLoginException("Wrong login!");
                }
            }
        }
    }

    static void checkPassword(String array) {

        int countNumbers = 0;
        int countLetters = 0;

        if (array == null || array.length() < 6 | array.length() > 25) {
            throw new WrongPasswordException("wrong password!");
        }
        for (int i = 0; i < array.length(); i++) {
            char symbol = array.charAt(i);

            if (isDigit(symbol)) {
                countNumbers++;
            } else if (symbol >= 'A' & symbol <= 'Z' | symbol >= 'a' && symbol <= 'z') {
                countLetters++;
            }
        }

        if (countNumbers == 0 | countLetters == 0) {

            throw new WrongPasswordException("wrong password!");
        }
    }

     static void isPasswordMatch(String password, String confirmPassword) {
        if (password == null || confirmPassword == null) {
            throw new WrongPasswordException("Passwords not match!");
        }
        if (Objects.equals(password, confirmPassword)) {
           return;

        }
       throw new WrongPasswordException("Passwords not match!");
    }

}




