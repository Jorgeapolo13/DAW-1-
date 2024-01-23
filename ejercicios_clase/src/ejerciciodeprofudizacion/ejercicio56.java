package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio56 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Calculadora de numeros Armstrong");
		System.out.println("Dame un numero entero positivo");
		int num=input.nextInt();
		int digito,ac=0,cont=0,aux;
		boolean esArmstrong=true;
		aux=num;
		while (aux!=0) {
			cont++;
			digito=aux%10;
			ac+=Math.pow(digito, cont);
			aux/=10;
		}
		if(ac!=num) {
			esArmstrong=false;
		}
		if (esArmstrong) {
			System.out.println("Es un numero Armstrong!");
		} else {
			System.out.println("No es un numero Armstrong :(");
		}
	
		input.close();
	}
}
