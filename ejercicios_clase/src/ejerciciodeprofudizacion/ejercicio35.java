package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio35 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num=input.nextInt();
		int digito;
		while (num!=0) {
			digito=num%10;
			System.out.println(digito);
			num/=10;
		}
		input.close();
	}

}
