package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio54 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Indica el numero de filas");
		int filas=input.nextInt();
		for(int i=0;i<filas;i++) {
			if(i==filas-1) {
				for(int j=0;j<filas;j++) {
					System.out.print("*");
				}
			}else {
				System.out.print("*");
				for(int j=0;j<i-1;j++) {
					System.out.print(" ");
				}
				if(i>0) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		input.close();
	}

}
