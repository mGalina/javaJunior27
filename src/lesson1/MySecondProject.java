package lesson1;

public class MySecondProject {
    public static void main(String[] args) {
        double roomWeight = 5.7;
        double roomLenght = 4; //автоматическое преобразование

        double tableWeight = 2;
        double tableLenght = 2.6;

        double squareRoom = roomWeight * roomLenght;
        double squareTable = tableWeight * tableLenght;

        int countTableToInsertRoom = (int) (squareRoom / squareTable);
        System.out.println("Столов влезит в комнату: " + countTableToInsertRoom);

        double squareFree = squareRoom -
                countTableToInsertRoom * squareTable;
        System.out.println("Свободная площадь: " + squareFree);
    }
}
