package operaciones;

import java.util.Scanner;

public class ParConCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int par = 0;

        System.out.println("¿Cuántos números Pares Desea Mostrar?");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (par % 2 == 0) {
                System.out.println(par);
                par += 2;
            }
        }
    }
}

