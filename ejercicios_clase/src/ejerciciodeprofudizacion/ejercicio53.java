package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio53 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String cadena="****";
		System.out.println("Indica el numero de filas");
		int filas=input.nextInt();
		int espacios=filas;
		for(int i=0;i<filas;i++) {
			for(int j=1;j<espacios;j++) {
				System.out.print(" ");
			}
			espacios--;
			System.out.println(cadena);
		}
		
		input.close();
	}

}
