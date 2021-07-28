package operaciones;

import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int impar = 0;
        int resultado = 0;

        System.out.println("¿Hasta Donde Desea Sumar Los Impares?");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (impar % 2 == 1) {
                resultado += impar;
            }
            impar += 1;
        }
        System.out.println(resultado);
    }
}
