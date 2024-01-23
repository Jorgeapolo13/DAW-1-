package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio50 {

	public static void main(String[] args) {
		ejercicio50 miObjeto= new ejercicio50();
		Scanner input=new Scanner(System.in);
		boolean salir=true;
		char opcion,c;
		int num;
		do {
			System.out.println("Menu:");
			System.out.println("a. Codigo ASCII del caracter...");
			System.out.println("b. Caracter asociado al codigo ASCII");
			System.out.println("c. Listado de minusculas");
			System.out.println("d. Listado de mayusculas");
			System.out.println("e. Salir");
			System.out.println("Seleccione una opcion:");
			opcion=input.next().toUpperCase().charAt(0);
			System.out.println();
			switch(opcion) {
				case 'A':
					System.out.println("Dame un caracter");
					c=input.next().charAt(0);
					System.out.println("El codigo ASCII asociado a ese caracter es "+miObjeto.CaracteraASCII(c));
					System.out.println();
					break;
				case 'B':
					System.out.println("Dame un numero");
					num=input.nextInt();
					System.out.println("El caracter asociado a ese codigo ASCII es "+miObjeto.ASCIIaCaracter(num));
					System.out.println();
					break;
				case 'C':
					miObjeto.minusculas();
					System.out.println();
					break;
				case 'D':
					miObjeto.mayusculas();
					System.out.println();
					break;
				case 'E':
					System.out.println("Adios");
					salir=false;
					break;
				default:
					System.out.println("ERROR");
					break;
			}
		} while (salir);
		
		input.close();
	}
	public int CaracteraASCII(char c) {
		int num;
		num = (int) c;
		return num; 
	}
	public char ASCIIaCaracter(int num) {
		char c;
		c = (char) num;
		return c;
	}
	public void minusculas() {
		for(int i=97;i<=122;i++) {
			System.out.print( (char)i );
		}
	}
	public void mayusculas() {
		for(int i=65;i<=90;i++) {
			System.out.print( (char)i );
		}
	}
}
