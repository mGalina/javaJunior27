package lesson11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>(100);
        texts.add("111");
        texts.add("222");
        texts.add("333");
        texts.add(0,"444");
        texts.set(0,"!!!!");
        System.out.println(texts);
        
        Collections.sort(texts);

//        LinkedList<String> texts1 = new LinkedList<>();
//        texts1.add("111");
//        texts1.add("222");
//        texts1.add("333");
//        texts1.add(0,"444");
//        texts1.set(0,"!!!!");
//        System.out.println(texts1);

        //способы прохода по коллекции
        //1 - for (только где есть индексы)
        for (int i = 0; i < texts.size(); i++){
            System.out.println(texts.get(i));
        }

        //2 - for each (для любой коллекции)
        for (String s: texts){
            System.out.println(s);
        }

        //3 - с помощью итератора (для любой коллекции)
        for (Iterator<String> iterator = texts.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
