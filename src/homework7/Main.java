package homework7;

public class Main {
    public static void main(String[] args) {

        int[] number = {7, 6, 7, 2, 3, 12, 56, 8, 7, 7, 0, -1};
        SoftwareUtils.numberOfEvenNumbers(number);

        System.out.println();

        SoftwareUtils.passwordValidation("Qwerty22");
        SoftwareUtils.passwordValidationTwo("Qwerty22");
        SoftwareUtils.passwordValidationThree("Qwerty22");

        System.out.println();

        //разные варианты для тестирования:
        SoftwareUtils.emailValidation("qwerty@mail.com");
        SoftwareUtils.emailValidation(".qwerty@mail.com");
        SoftwareUtils.emailValidation("qwerty@mail.com.");
        SoftwareUtils.emailValidation("qwerty@@mail.com");
        SoftwareUtils.emailValidation("qwerty@mail..com");
    }
}