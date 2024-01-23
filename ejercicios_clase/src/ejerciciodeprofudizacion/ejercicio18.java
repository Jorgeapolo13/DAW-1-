package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,num2, cont=0;
		System.out.println("Dame dos numeros enteros");
		num1=input.nextInt();
		num2=input.nextInt();
		for(int i=num1;i<=num2;i++) {
			if (i%3==0) {
				cont++;
			}
		}
		System.out.println(cont);
		input.close();
	}

}
