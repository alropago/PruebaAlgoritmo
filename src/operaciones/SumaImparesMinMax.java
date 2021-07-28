package operaciones;

import java.util.Scanner;

public class SumaImparesMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min;
        int max;
        int sumatoria = 0;

        System.out.println("Digite El Número Inferior");
        min = sc.nextInt();

        System.out.println("Digite El Número Superior");
        max = sc.nextInt();

        for (int i = min; i <= max; i++) {
            if (i % 2 == 1 && i > 6) {
                sumatoria += i;
            }
        }
        System.out.println(sumatoria);
    }
}
