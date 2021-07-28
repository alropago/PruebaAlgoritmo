package operaciones;

import java.util.Scanner;

public class ParesSinCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int par = 0;

        System.out.println("¿Cuántos números Pares Desea Mostrar?");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {

            if (par % 2 == 0 && par != 0) {
                System.out.println(par);
            }
            par += 2;
        }
    }
}

