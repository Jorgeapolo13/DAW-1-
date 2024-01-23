package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio61 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Dame un numero entero positivo");
		int num=input.nextInt();
		int i, ac=1;
		for(i=1;i<=num;i++){
			ac*=i;
		}
		System.out.println(ac);
		input.close();
	}

}
