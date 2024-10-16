//Programa que muestre en lineas separadas lo siguiente: ZYWXVUTSRQPONMLKJIHGFEDCBA,
// YWXVUTSRQPONMLKJIHGFEDCBA, WXVUTSRQPONMLKJIHGFEDCBA, ...., DCBA, CBA, BA, A.

public class Ejercicio_4_Bucles_Anidados {
    public static void main(String[] args) {
        for (char x = 'Z'; x >= 'A'; x--) {
            for (char y = x; y >= 'A'; y--) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
