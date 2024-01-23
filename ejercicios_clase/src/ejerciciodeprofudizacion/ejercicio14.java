package ejerciciodeprofudizacion;

import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean salir=false;
		int resultado, num1=0, num2=0;
		System.out.println("Menu:");
		System.out.println("Suma");
		System.out.println("Resta");
		System.out.println("Salir");
		do {
			System.out.println("Selecciona una opcion");
			int opcion=input.nextInt();
			if(opcion!=4) {
				System.out.println("Dame dos numeros");
				num1=input.nextInt();
				num2=input.nextInt();
			}
			switch(opcion) {
				case 1:
					System.out.println("Sumar");
					resultado=num1+num2;
					System.out.println("El resultado de la suma es: "+resultado);
					break;
				case 2:
					System.out.println("Resta");
					resultado=num1-num2;
					System.out.println("El resultado de la suma es: "+resultado);
					break;
				case 3:
					System.out.println("Salir");
					salir=true;
					break;
				default:
					System.out.println("ERROR");
					break;
			}		
		}while(!salir);
		input.close();
	}
}
