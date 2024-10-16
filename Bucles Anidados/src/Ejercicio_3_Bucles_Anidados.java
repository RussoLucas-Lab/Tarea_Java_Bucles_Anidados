import java.util.Scanner;

public class Ejercicio_3_Bucles_Anidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Igrese un numero: ");
        int n= sc.nextInt();
        int suma=0;
        int factorial=1;
        for (int i=1; i<=n ;i++) {
            factorial = 1;

            for (int j = 1 ; j <=i ; j++)
                factorial = j * factorial;


            System.out.print("!" + i + " = " + factorial+"\n");

            suma = suma + factorial;
        }
        System.out.print("La suma de los factoriales es: "+ suma);

    }
}
