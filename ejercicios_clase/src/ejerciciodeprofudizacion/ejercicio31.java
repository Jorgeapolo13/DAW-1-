package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio31 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Dame un año");
		int año=input.nextInt();
		if(año%4==0) {
			if(año%100!=0) {
				System.out.println("El año "+año+" es bisiesto");
			}
			else {
				System.out.println("El año "+año+" no es bisiesto");
			}
		}else {
			if(año%400==0) {
				System.out.println("El año "+año+" es bisiesto");
			}
			else {
				System.out.println("El año "+año+" no es bisiesto");
			}
		}
		input.close();
	}

}
