package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio41 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Dame un numero entero positivo");
		int num=input.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.print(i+"-->");
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		
		input.close();
	}

}

