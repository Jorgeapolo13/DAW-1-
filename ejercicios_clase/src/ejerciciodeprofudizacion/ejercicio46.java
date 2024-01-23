package ejerciciodeprofudizacion;

import java.util.Scanner;
import java.util.Random;
class ejercicio46 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Random random = new Random();
		boolean salir=true;
		int num;
		do {
			num=random.nextInt(1,50);
			System.out.println("El numero aleatorio generado es: "+num);
			System.out.println("Desea salir del programa de numeros aleatorios? Y/N");
			char c=input.next().toUpperCase().charAt(0);
			if(c=='Y') {
				salir=false;
			}
		} while (salir);
		input.close();
	}

}
