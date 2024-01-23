package ejerciciodeprofudizacion;
import java.util.Scanner;

public class ejercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declarar un array para almacenar los números
        int[] numeros = new int[10];

        // Pedir al usuario que introduzca 10 números
        System.out.println("Introduce 10 números para llenar el array:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenar el array en orden ascendente usando el algoritmo de bubble sort
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiar los elementos si están en el orden incorrecto
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Mostrar los números ordenados en orden ascendente
        System.out.println("Números introducidos en orden ascendente:");
        for (int i = 0; i < 10; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
    }
}

