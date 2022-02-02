package homework7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftwareUtils {

    /*
     * 1) Метод принимает массив чисел, и возвращает из метода кол-во четных цифр в этом массиве
     */

    public static int numberOfEvenNumbers(int[] number) {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (i % 2 == 0 && i != 0) {
                count++;
            }
        }
        System.out.println("Количество четных чисел: " + count);
        return count;
    }

    /*
     * 2) Метод принимает текстовую переменную (пароль), и должен вернуть true, или false.
     * Если пароль содержит хотя бы одну цифру и заглавную букву и при этом он больше 8ми символов - вернуть true.
     * Вариант 1.
     */

    public static boolean passwordValidation(String password) {

        if (!(password.length() >= 8)) {
            System.out.println(false);
            return false;
        }
        if (!(password.contains("0") || password.contains("1") ||
                password.contains("2") || password.contains("3") || password.contains("4") ||
                password.contains("5") || password.contains("6") || password.contains("7") ||
                password.contains("8") || password.contains("9"))) {
            System.out.println(false);
            return false;
        }
        if (!(password.contains("A") || password.contains("B") || password.contains("C") ||
                password.contains("D") || password.contains("E") || password.contains("F") ||
                password.contains("G") || password.contains("H") || password.contains("I") ||
                password.contains("J") || password.contains("K") || password.contains("L") ||
                password.contains("M") || password.contains("N") || password.contains("O") ||
                password.contains("P") || password.contains("Q") || password.contains("R") ||
                password.contains("S") || password.contains("T") || password.contains("U") ||
                password.contains("V") || password.contains("W") || password.contains("X") ||
                password.contains("Y") || password.contains("Z"))) {
            System.out.println(false);
            return false;
        }
        System.out.println(true);
        return true;
    }

    /*
     * 2) Метод принимает текстовую переменную (пароль), и должен вернуть true, или false.
     * Если пароль содержит хотя бы одну цифру и заглавную букву и при этом он больше 8ми символов - вернуть true.
     * Вариант 2.
     */

    public static boolean passwordValidationTwo(String password) {

        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int countNumInPassword = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (password.contains(numbers[i])) {
                countNumInPassword++;
            }
        }

        String[] capitalLetters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int countCapitalLetters = 0;
        for (int i = 0; i < capitalLetters.length; i++) {
            if (password.contains(capitalLetters[i])) {
                countCapitalLetters++;
            }
        }

        if (!(password.length() >= 8 && countNumInPassword >= 1 && countCapitalLetters >= 1)) {
            System.out.println(false);
            return false;
        }
        System.out.println(true);
        return true;
    }

    /*password
     * 2) Метод принимает текстовую переменную (пароль), и должен вернуть true, или false.
     * Если пароль содержит хотя бы одну цифру и заглавную букву и при этом он больше 8ми символов - вернуть true.
     * Вариант 3.
     */

    public static boolean passwordValidationThree(String password) {

        String passwordRegex = "[A-Z0-9]{8,20}";
        Pattern passwordPat = Pattern.compile(passwordRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = passwordPat.matcher(password);
        System.out.println(matcher.find());

        return matcher.find();
    }

    /*
     * 3) Метод принимает текстовую переменную (email), и проверяет его на валидность.
     * И должен вернуть true, если в email содержится собачка, и только одна, если email не заканчивается и не начинается с точки,
     * если email после @ содержит только одну точку. Во всех остальных случаях вернуть false.
     * Вариант 1.
     */

    public static boolean emailValidation(String email) {

        int countAt = 0;
        int countDot = 0;
        int index = 0;

        if (email.charAt(0) == '.' || email.charAt(email.length() - 1) == '.') {
            System.out.println(false);
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                countAt++;
                index = i;
            }
            if (email.charAt(i) == '.' && index != 0) {
                if (i > index) {
                    countDot++;
                }
            }
        }

        if (!(countAt == 1 && countDot == 1)) {
            System.out.println(false);
            return false;
        }
        System.out.println(true);
        return true;
    }

    /*
     * 3) Метод принимает текстовую переменную (email), и проверяет его на валидность.
     * И должен вернуть true, если в email содержится собачка, и только одна, если email не заканчивается и не начинается с точки,
     * если email после @ содержит только одну точку. Во всех остальных случаях вернуть false.
     * Вариант 2.
     */

    public static boolean emailValidationTwo(String email) {

        String emailRegex = "[A-Z0-9.]+@[A-Z0-9.]+[A-Z]{2,6}";
        Pattern emailPat = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPat.matcher(email);
        System.out.println(matcher.find());

        return matcher.find();
    }
}