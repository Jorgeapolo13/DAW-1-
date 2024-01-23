package ejerciciodeprofudizacion;

import java.util.Scanner;

public class ejercicio52{
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad en euros: ");
        int cantidad = input.nextInt();

        int[] denominaciones = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        String[] nombres = {"Billetes de 500", "Billetes de 200", "Billetes de 100", "Billetes de 50", "Billetes de 20", "Billetes de 10", "Billetes de 5", "Monedas de 2", "Monedas de 1"};

        System.out.println("Cantidad " + cantidad + ":");

        for (int i = 0; i < denominaciones.length; i++) {
            int billetesOMonedas = cantidad / denominaciones[i];
            cantidad %= denominaciones[i];
            System.out.println(nombres[i] + " -> " + billetesOMonedas);
        }
        
        input.close();
    }
}

