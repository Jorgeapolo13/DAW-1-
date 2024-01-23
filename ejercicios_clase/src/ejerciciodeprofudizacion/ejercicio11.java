package ejerciciodeprofudizacion;

import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean repetir=true;
		char opcion;
		do {
			System.out.println("Dame dos numeros positivos mayor que cero y te digo si es par o impar");
			int num1=input.nextInt();
			int num2=input.nextInt();
			if(num1%2==0){
				System.out.println("El numero 1 es par");
			}
			else {
				System.out.println("El numero 1 es impar");
			}
			if(num2%2==0){
				System.out.println("El numero 2 es par");
			}
			else {
				System.out.println("El numero 2 es impar");
			}
			System.out.println("Desea repetir el proceso? Y/N");
			opcion = input.next().charAt(0);
			if(opcion=='N'){
					repetir=false;
			}
		}while(repetir);
		input.close();
		}
}
