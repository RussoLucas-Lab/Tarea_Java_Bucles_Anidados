//1. Mostrar los números perfectos entre 1 y 1000.

public class Ejercicio_1_Bucles_Anidados {
    public static void main(String[] args) {
        int i, j, suma;
        System.out.println("Números perfectos entre 1 y 1000: ");
        for(i=1;i <= 1000;i++){
            suma = 0;
            for(j = 1;j < i;j++){
                if(i % j==0){
                    suma = suma + j;
                }
            }
            if(i == suma){
                System.out.println(i);
            }
        }
    }
}