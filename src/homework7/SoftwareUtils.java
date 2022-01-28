package homework7;

public class SoftwareUtils {

    /**
     * 1) Метод принимает массив чисел, и возвращает из метода кол-во четных цифр в этом массиве
     * 2) Метод принимает текстовую переменную (пароль), и должен вернуть true, или false.
     * Если пароль содержит хотя бы одну цифру и заглавную букву и при этом он больше 8ми символов - вернуть true.
     * 3) Метод принимает текстовую переменную (email), и проверяет его на валидность.
     * И должен вернуть true, если в email содержится собачка, и только одна, если email не заканчивается и не начинается с точки,
     * если email после @ содержит только одну точку. Во всех остальных случаях вернуть false
     */

    //1. Метод возвращает кол-во четных цифр.
    public static void numberOfEvenNumbers(int[] number) {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (i % 2 == 0 && i != 0) {
                count++;
            }
        }
        System.out.println("Количество четных чисел: " + count);
    }

    //2. Метод валидации пароля. 1-й способ.
    public static void passwordValidation(String password) {
        if (password.length() >= 8 && password.contains("0") || password.contains("1") ||
                password.contains("2") || password.contains("3") || password.contains("4") ||
                password.contains("5") || password.contains("6") || password.contains("7") ||
                password.contains("8") || password.contains("9")) {
            System.out.println(true);
        }
    }

    //2. Метод валидации пароля. 2-й способ.
    public static void passwordValidationTwo(String password) {
        System.out.println(password.length() >= 8 && password.contains("0") || password.contains("1") ||
                password.contains("2") || password.contains("3") || password.contains("4") ||
                password.contains("5") || password.contains("6") || password.contains("7") ||
                password.contains("8") || password.contains("9"));
    }

    //2. Метод валидации пароля. 3-й способ.
    public static void passwordValidationThree(String password) {
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int countNumInPassword = 0;
        for (String currentNum : numbers) {
            if (password.contains(currentNum)) {
                countNumInPassword++;
            }
        }
        System.out.println(password.length() >= 8 && countNumInPassword >= 1);
    }

    //3. Метод валидации email
    public static void emailValidation(String email) {
        boolean dot = true;
        int countAt = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                countAt++;
            }
            if (email.charAt(0) == '.' || email.charAt(email.length() - 1) == '.') {
                dot = false;
            }
        }
        System.out.println(countAt == 1 && dot);
    }
}
