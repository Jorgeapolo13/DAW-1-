package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio58 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean esPalindromo=true;
		
		System.out.println("Introduce una palabra");
		String cadena=input.next().toLowerCase();
		
		for(int i=0;i<cadena.length()/2;i++) {
			
			if ( cadena.charAt(i) != cadena.charAt( cadena.length() - (i+1) )) {
				esPalindromo=false;
				break;
			}
			
		}
		
		if (esPalindromo) {
			System.out.println("Es un palindromo!");
		} else {
			System.out.println("No es un palindromo :(");
		}
				
				
				
		input.close();
	}

}
