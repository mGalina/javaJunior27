package lesson3;

public class Main4 {
    public static void main(String[] args) {
        char[] simvols = {'h', 'y', 'g', '6', 'g', 'w', 's', 'e'};

        for (int i = 0; i <= simvols.length ; i++) {
            if (simvols[i] == 'o' || simvols[i] == 'e' || simvols[i] == 'i') {
                System.out.println(simvols[i]);
            }
        }
    }
}
