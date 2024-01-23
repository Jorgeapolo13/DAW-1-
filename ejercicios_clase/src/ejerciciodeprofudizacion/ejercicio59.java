package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio59 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Calculadora de numeros positivos");
		System.out.println();
		
		System.out.println("Dame un numero entero postivo mayor que 1");
		int num=input.nextInt();
		
		boolean esPrimo=true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				esPrimo=false;
			}
		}
		
		if(esPrimo) {
			System.out.println("Es primo!");
		}else {
			System.out.println("No es primo");
		}
		
		input.close();
	}

}
