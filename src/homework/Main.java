package homework;

public class Main {
    public static void main(String[] args) {

        /**
         * Домашнее задание:
         * Создать методы:
         * 1) Мы передаем в метод текст, а он нам возвращает кол-во слов (числом)
         * 2) Мы передаем Текст, метод печатает на консоль этот же текст, только КАЖДОЕ слово наоборот будет напечатано *** (метод сложный, делают только те кто в себе уверен)
         * 3) Мы передаем текст, нужно напечатать на консоль сколько в нем согласных букв
         * 4) Мы передаем 3 числа - три стороны треугольника, метод должен вернуть площадь треугольника
         * 5) Мы передаем сторону и основание, метод должен вернуть площадь треугольника
         */

        int count = StringUtils.wordCount("Это тестовый текст в котором ровно восемь слов.");

        String result = StringUtils.upsideDownWord("А роза упала на лапу азора");

        int countConsonants = StringUtils.numberOfConsonants("Тетрагидропиранилциклопентилтетрагидропиридопиридиновые");

        double area = NumericalUtils.areaOfTriangle(3, 4, 5);

        double areaTriangle = NumericalUtils.areaOranIsOscelesTriangle(6, 7);
    }
}
