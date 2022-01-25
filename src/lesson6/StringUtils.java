package lesson6;

import java.util.Locale;

public class StringUtils {

    /**
     * 1 - модификатор доступа (одно из 4-х видов слов, которое регулирует (управляет) область видимости данного метода
     * public -  доступен внутри всего провект
     * ______ - доступен внутри текущего пакета
     * protected - доступен внутри пакета и класса наследником
     * private - доступ внутри текущего класса (нельзя вызвать за перделами класса)
     * <p>
     * 2 - static (или пишем, или нет).
     * 3 - возвращаемый тип (int, String, Date, ...) или void - если ничего не возвращается
     * 4 - назваине метода
     * 5 - входящие параметры (String text, int count) ...
     * 6 - тело метода, то что будет происходить при вызове данного метода
     */

    public static int countGlassFromText(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'o' ||
                    text.charAt(i) == 'i' || text.charAt(i) == 'e' ||
                    text.charAt(i) == 'y' || text.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void printTextByWords(String text) {
        text = text.replace(",", "");
        text = text.replace(".", "");
        text = text.replace(":", "");
        text = text.replace("!", "");
        text = text.replace("?", "");
        text = text.replace(";", "");
        text = text.replace("-", "");
        text = text.replace(">", "");

        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    public static void coding(String textByCoding) {
        String alfabet = "abcdefghijklmnopqrstuvwxyza";
        String alfabetUpper = alfabet.toUpperCase(Locale.ROOT);
        String result = "";
        for (int i = 0; i < textByCoding.length(); i++) {
            int index = alfabet.indexOf(textByCoding.charAt(i));
            int indexUpper = alfabetUpper.indexOf(textByCoding.charAt(i));
            if (index >= 0) {
                result += alfabet.charAt(index + 1);
            } else if (indexUpper >= 0) {
                result += alfabetUpper.charAt(indexUpper + 1);
            } else {
                result += textByCoding.charAt(i);
            }
        }
        System.out.println(result);
    }
}
