package homework7;

public class Main {
    public static void main(String[] args) {

        // 1) Тестирование:
        int[] number = {7, 6, 7, 2, 3, 12, 56, 8, 7, 7, 0, -1};
        SoftwareUtils.numberOfEvenNumbers(number);

        System.out.println("Валидация пароля: ");

        //2) Тестировнаие варианта 1 и 2 и 3
        SoftwareUtils.passwordValidation("Qwerty22");
        SoftwareUtils.passwordValidationTwo("Qwerty22");
        SoftwareUtils.passwordValidationThree("Qwerty22");

        System.out.println("Валидация email: ");

        //3) Тестировнаие варианта 1
        SoftwareUtils.emailValidation("qwerty@mail.com");
        SoftwareUtils.emailValidation(".qwerty@mail.com");
        SoftwareUtils.emailValidation("qwerty@mail.com.");
        SoftwareUtils.emailValidation("qwerty@@mail.com");
        SoftwareUtils.emailValidation("qwerty@mail..com");

        System.out.println("Валидация email: ");

        //3) Тестировнаие варианта 2
        SoftwareUtils.emailValidationTwo("qwerty@mail.com");
        SoftwareUtils.emailValidation(".qwerty@mail.com");
        SoftwareUtils.emailValidation("qwerty@mail.com.");
        SoftwareUtils.emailValidation("qwerty@@mail.com");
        SoftwareUtils.emailValidation("qwerty@mail..com");
    }
}