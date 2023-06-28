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
    void loginContainsNonEnglishLetters() {
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
    void passwordContainsOnlyEnglishLetters() {
        Assertions.assertThrows(WrongPasswordException.class,
                () -> {
                    User.checkPassword("aaaaaaa");
                });
    }

    @Test
    void passwordContainsOnlyNumbers() {
        Assertions.assertThrows(WrongPasswordException.class,
                () -> {
                    User.checkPassword("2222222");
                });
    }

    @Test
    void passwordContainsNonEnglishLetters() {
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

    @Test
    void checkIsPasswordsMatch() {
        Assertions.assertThrows(WrongPasswordException.class,
                () -> {
                    User.isPasswordMatch("AAaa22", "AAaa2");
                });

    }

    @Test
    void checkOnePasswordEmpty() {
        Assertions.assertThrows(WrongPasswordException.class,
                () -> {
                    User.isPasswordMatch("AAaa22", " ");
                });

    }

    @Test
    void checkOnePasswordIsNull() {
        Assertions.assertThrows(WrongPasswordException.class,
                () -> {
                    User.isPasswordMatch("AAaa22", null);
                });

    }

    @Test
    void checkThatUserCreate() {
        User user = new User("Login", "aaa222", "aaa222");

        Assertions.assertEquals("Login", user.getLogin());
        Assertions.assertEquals("aaa222", user.getPassword());
        Assertions.assertEquals("aaa222", user.getConfirmPassword());
    }

    @Test
    void checkWhenUserEnteredIncorrectData() {
        Assertions.assertThrows(WrongPasswordException.class,
                () -> {
                    new User("Login", "aaaa", "123aa");
                });

        Assertions.assertThrows(WrongPasswordException.class,
                () -> {
                    new User("Login", "aaaa222", "123aa");
                });

        Assertions.assertThrows(WrongLoginException.class,
                () -> {
                    new User("111", "aaaa22", "aaaa22");
                });
    }

}