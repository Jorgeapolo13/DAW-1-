package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio57 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Comprobador de caracteres");
		System.out.println("Ingrese una cadena de caracteres");
		String cadena=input.nextLine();
		int contMay=0,contDig=0,contMin=0;
		for(int i=0;i<cadena.length();i++) {
			char caracter = cadena.charAt(i);
            if (Character.isUpperCase(caracter)) {
                contMay++;
            } else if (Character.isLowerCase(caracter)) {
                contMin++;
            } else if (Character.isDigit(caracter)) {
                contDig++;
            }
		}
		System.out.println("El numero de mayusculas de la cadena son "+contMay);
		System.out.println("El numero de minusculas de la cadena son "+contMin);
		System.out.println("El numero de digitos de la cadena son "+contDig);
		input.close();
	}

}
