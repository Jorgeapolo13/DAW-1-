package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean salir=true;
		int cont=0,num;
		do {
			System.out.println("Dame un numero entero positivo si desea salir del programa teclee el numero -9999");
			num=input.nextInt();
			if(num==-9999) {
				salir=false;
			}
			else if(num%2==0) {
				cont++;
			}
		} while (salir);
		
		System.out.println("El numero de pares tecleados son: "+cont);
		
		input.close();
	}

}
