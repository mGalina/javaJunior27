package homework;

public class Main {
    public static void main(String[] args) {

        /*
         * Домашнее задание:
         * Создать методы:
         * 1) Мы передаем в метод текст, а он нам возвращает кол-во слов (числом)
         * 2) Мы передаем Текст, метод печатает на консоль этот же текст, только КАЖДОЕ слово наоборот будет напечатано
         * 3) Мы передаем текст, нужно напечатать на консоль сколько в нем согласных букв
         * 4) Мы передаем 3 числа - три стороны треугольника, метод должен вернуть площадь треугольника
         * 5) Мы передаем сторону и основание, метод должен вернуть площадь треугольника
         */

        int count = StringUtils.wordCount("Это тестовый текст в котором ровно восемь слов.");

        //Проверка 2-го варианта:
        StringUtils.wordCount("Это тестовый текст в котором ровно восемь слов.");

        //Проверка варианта для перевертывания всего текста:
        String result = StringUtils.upsideDownWord("А роза упала на лапу азора");

        //Проверка варианта где перевернуто КАЖДОЕ слово:
        StringUtils.upsideDownWords("А роза упала на лапу азора");

        int countConsonants = StringUtils.numberOfConsonants("Тетрагидропиранилциклопентилтетрагидропиридопиридиновые");

        double area = NumericalUtils.areaOfTriangle(3, 4, 5);

        double areaTriangle = NumericalUtils.areaOfAnIsoscelesTriangle(6, 7);
    }
}