package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio33 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean salir=true;
		int num1,num2;
		do {
			System.out.println("Dame dos caracteres");
			char c1=input.next().charAt(0);
			char c2=input.next().charAt(0);
			num1=(int) c1;
			num2=(int) c2;
			if(num1>num2) {
				System.out.println("El caracter "+c1+" tiene un codigo ASCII mayor a "+c2);
			}else {
				System.out.println("El caracter "+c2+" tiene un codigo ASCII mayor a "+c1);
			}
			System.out.println("Desea salir del programa Y/N");
			char c=input.next().toUpperCase().charAt(0);
			if(c=='Y') {
				salir=false;
			}
		} while (salir);
		input.close();
	}

}
