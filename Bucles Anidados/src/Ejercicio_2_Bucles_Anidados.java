//2. Leer un número N y calcular el factorial de los números desde 0 hasta N.

import java.util.Scanner;

public class Ejercicio_2_Bucles_Anidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Igrese un numero: ");
        int n= sc.nextInt();

        int factorial=1;
        for (int i=1; i<=n ;i++) {
            factorial = 1;

            for (int j = 1 ; j <=i ; j++)
                factorial = j * factorial;


            System.out.print("!" + i + " = " + factorial+"\n");
        }


    }
}
