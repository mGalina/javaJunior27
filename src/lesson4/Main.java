package lesson4;

public class Main {
    public static void main(String[] args) {
        String email = "natalia@gmail.com";
        int dlinna = email.length();
        System.out.println(dlinna);

        String password = "jfjjfhjfjhf";
        int dlinnaPassword = password.length();
        System.out.println(dlinnaPassword);

        if (dlinnaPassword < 8) {
            System.out.println("Пароль слишком короткий!");
            return;
        }
        // Проверим содержит ли пароль цифры (способ 1)
        if (!password.contains("0") && !password.contains("1") &&
                !password.contains("2") && !password.contains("3") &&
                !password.contains("4") && !password.contains("5") &&
                !password.contains("6") && !password.contains("7") &&
                !password.contains("8") && !password.contains("9")) {
            System.out.println("В пароле нет цифры!");
            return;
        }

        // Проверим содержит ли пароль цифры (способ 2)
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int countNumInPassword = 0;
        for (int i = 0; i < numbers.length; i++){
            String currentNum = numbers[i];
            if (password.contains(currentNum)){
                countNumInPassword++;
            }
        }

        if (countNumInPassword < 2) {
            System.out.println("Цифр меньше двух в пароле!!");
            return;
        }
    }
}
