package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio29 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean salir=false;
		char c;
		int numchar;
		do {
			System.out.println("Escribe un caracter y te lo convierto en un numero por ASCII");
			c=input.next().charAt(0);
			numchar= (int) c;
			System.out.println("Este es tu numero: "+numchar+", desea salir del programa Y/N");
			c=input.next().toUpperCase().charAt(0);
			if(c=='Y') {
				salir=true;
			}
		} while (!salir);
		
		input.close();

	}

}
