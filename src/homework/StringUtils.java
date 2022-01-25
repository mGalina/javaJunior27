package homework;

public class StringUtils {

    public static int wordCount(String text) {

        int count = 0;
        if (text.length() != 0) {
            count++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Количество слов в тексте: " + count);
        return count;
    }

    public static String upsideDownWord(String text) {

        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        System.out.println("Текст где все слова наоборот: " + result);
        return result;
    }

    public static int numberOfConsonants(String text) {

        int countConsonants = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'б' || text.charAt(i) == 'в' || text.charAt(i) == 'г' || text.charAt(i) == 'д'
                    || text.charAt(i) == 'ж' || text.charAt(i) == 'з' || text.charAt(i) == 'й' || text.charAt(i) == 'к'
                    || text.charAt(i) == 'л' || text.charAt(i) == 'м' || text.charAt(i) == 'н' || text.charAt(i) == 'п'
                    || text.charAt(i) == 'р' || text.charAt(i) == 'с' || text.charAt(i) == 'т' || text.charAt(i) == 'ф'
                    || text.charAt(i) == 'х' || text.charAt(i) == 'ц' || text.charAt(i) == 'ч' || text.charAt(i) == 'ш'
                    || text.charAt(i) == 'щ'
                    || text.charAt(i) == 'Б' || text.charAt(i) == 'В' || text.charAt(i) == 'Г' || text.charAt(i) == 'Д'
                    || text.charAt(i) == 'Ж' || text.charAt(i) == 'З' || text.charAt(i) == 'Й' || text.charAt(i) == 'К'
                    || text.charAt(i) == 'Л' || text.charAt(i) == 'M' || text.charAt(i) == 'Н' || text.charAt(i) == 'П'
                    || text.charAt(i) == 'P' || text.charAt(i) == 'C' || text.charAt(i) == 'Т' || text.charAt(i) == 'Ф'
                    || text.charAt(i) == 'Х' || text.charAt(i) == 'Ц' || text.charAt(i) == 'Ч' || text.charAt(i) == 'Ш'
                    || text.charAt(i) == 'Щ') {
                countConsonants++;
            }
        }
        System.out.println("Количество согласных букв в тексте в тексте: " + countConsonants);
        return countConsonants;
    }
}