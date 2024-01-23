package arrays;

import java.util.Random;
import java.util.Scanner;

class ejercicio20 {

	public static void main(String[] args) {
		Double [][] matriz= new Double [4][5];
		System.out.println("Introduce la fila que quieres que te muestre");
		Scanner input= new Scanner(System.in);
		int fila=input.nextInt()-1;
		Double ac=0.0;
		RellenarMatriz(matriz);
		for(int i=0;i<matriz[0].length;i++) {
			System.out.printf("Fila "+(i+1)+" %.2f%n", matriz[fila][i]);
			ac+=matriz[fila][i];
		}
		System.out.printf("La suma es: %.2f%n", ac);
		input.close();
	}
	public static void RellenarMatriz(Double [][] matriz) {
		Random random= new Random();
		for(int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				matriz[i][j]=random.nextDouble(10)+1;
			}
		}
	}
}
