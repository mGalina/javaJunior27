package lesson5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int year = 0; year < 10; year++) {
            for (int day = 0; day < 366; day++) {
                for (int hour = 0; hour < 24; hour++) {
                    for (int min = 0; min < 60; min++) {
                        for (int sec = 0; sec < 60; sec++) {
                            System.out.printf("Со старта прошло: %d года, %d дня," +
                                    "%d часа, %d минут, %d секунд \n", year, day, hour, min, sec);
                            Thread.sleep(1000);
                        }
                    }
                }
            }
        }
    }
}
