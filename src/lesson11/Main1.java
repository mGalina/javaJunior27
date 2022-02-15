package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long startTimeArrayGet = System.currentTimeMillis();
        System.out.println("Время начала " + startTimeArrayGet);
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        long andTimeArrayGet = System.currentTimeMillis();
        System.out.println("ArrayList get: " + (andTimeArrayGet - startTimeArrayGet));

        long startTimeLinkedGet = System.currentTimeMillis();
        System.out.println("Время начала " + startTimeLinkedGet);
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        long andTimeLinkedGet = System.currentTimeMillis();
        System.out.println("LinkedList get: " + (andTimeLinkedGet - startTimeLinkedGet));


    }
}
