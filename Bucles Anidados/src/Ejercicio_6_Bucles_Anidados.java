import java.util.Scanner;

public class Ejercicio_6_Bucles_Anidados {
    public static void main(String[] args) {
        int N, i, j;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero > 0: ");
            N = sc.nextInt();
        } while (N <= 0);
        System.out.println("Números primos desde 1 hasta " + N);

        for (j = 2; j <= N; j++) {
            i = 2;
            while (j % i != 0) {
                i++;
            }
            if (i == j) {
                System.out.println(j);
            }
        }
    }
}
