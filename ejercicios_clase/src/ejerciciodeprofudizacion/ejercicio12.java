package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dame tu altura en m");
		Double alt=input.nextDouble();
		System.out.println("Dame tu peso en kg");
		Double peso=input.nextDouble();
		peso=peso/(Math.pow(alt,2));
		System.out.println("Tu indice de masa corporal es: "+peso);
		input.close();
	}

}
