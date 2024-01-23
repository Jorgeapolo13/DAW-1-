package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio34 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Ingrese un caracter");
		char c=input.next().charAt(0);
		int num=(int) c;
		if(num>=65&&num<=90) {
			System.out.println("Este numero pertenece a las letras mayusculas");
		} else if (num>=97&&num<=122) {
			System.out.println("Este numero pertenece a las letras minisculas");
		} else if (num>=48&&num<=57) {
			System.out.println("Este numero pertenece a los digitos");
		} else {
			System.out.println("Este numero no es una letra ni un digito");
		}
		input.close();
	}

}
