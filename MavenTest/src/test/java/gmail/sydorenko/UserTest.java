package gmail.sydorenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void isLoginToLong() {
        Assertions.assertThrows(WrongLoginException.class,
                () -> {
                    User.checkLogin("aaaaaaaaaaaaaaaaaaaaaaaaa");
                });
    }

    @Test
    void isLoginContainsEnglishLetters() {
        Assertions.assertThrows(WrongLoginException.class,
                () -> {
                    User.checkLogin("вввв");
                });
    }

    @Test
    void checkLoginToNull() {
        Assertions.assertThrows(WrongLoginException.class,
                () -> {
                    User.checkLogin(null);
                });
    }

    @Test
    void checkEmptyLogin() {
        Assertions.assertThrows(WrongLoginException.class,
                () -> {
                    User.checkLogin("");
                });
    }


    @Test
    void isPasswordContainsNumbers() {
        Assertions.assertThrows(WrongPasswordException.class,
                () -> {
                    User.checkPassword("aaaaaaa");
                });
    }

    @Test
    void isPasswordContainsLetters() {
        Assertions.assertThrows(WrongPasswordException.class,
                () -> {
                    User.checkPassword("2222222");
                });
    }

    @Test
    void isPasswordContainsEnglishLetters() {
        Assertions.assertThrows(WrongPasswordException.class,
                () -> {
                    User.checkPassword("вввввв12");
                });
    }

    @Test
    void isPasswordToLong() {
        Assertions.assertThrows(WrongPasswordException.class,
                () -> {
                    User.checkPassword("aaaaaaaaaaaaaaaaaaaaaaaaaaa122222222222");
                });
    }

    @Test
    void isPasswordToShort() {
        Assertions.assertThrows(WrongPasswordException.class,
                () -> {
                    User.checkPassword("aa22");
                });
    }

    @Test
    void checkPasswordToNull() {
        Assertions.assertThrows(WrongPasswordException.class,
                () -> {
                    User.checkPassword(null);
                });
    }

    @Test
    void checkEmptyPassword() {
        Assertions.assertThrows(WrongPasswordException.class,
                () -> {
                    User.checkPassword("");
                });
    }

}