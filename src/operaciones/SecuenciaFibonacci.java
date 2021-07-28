package operaciones;

import java.util.Scanner;

public class SecuenciaFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("¿Cuantos Números De La Secuencia Desea Mostrar?");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(SecuenciaFibonacci(i));
        }
    }

    public static int SecuenciaFibonacci(int posicion) {
        if (posicion == 0) {
            return 0;
        } else if (posicion == 1) {
            return 1;
        } else {
            return SecuenciaFibonacci(posicion - 1) + SecuenciaFibonacci(posicion - 2);
        }
    }

}