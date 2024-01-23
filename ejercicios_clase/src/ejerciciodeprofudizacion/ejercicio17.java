package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dame un numero entero positivo");
		int num=input.nextInt();
		int ac=0;
		for(int i=num;i>=0;i--) {
			ac=ac+i;
		}
		System.out.println(ac);
		input.close();

	}

}
