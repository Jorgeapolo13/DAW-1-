package arrays;

import java.util.Random;
import java.util.Scanner;

class ejercicio08 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Random rand = new Random();
		int num;
		int menor=0,ac=0;
		int[] a= new int [10];
		for(int i=0;i<a.length;i++) {
			num=rand.nextInt(1000)+1;
			a[i]=num;
			if(i==0||num<menor) {
				menor=num;
			}
			ac+=num;
		}
		ac/=10;
		System.out.println("Desea solcitar la media y el menor de los numeros del array Y/N");
		char c=input.next().toUpperCase().charAt(0);
		if(c=='Y') {
			System.out.println("La media de los valores es: "+ac+" ,y el menor de los valores es: "+menor);
		}
		input.close();
	}

}
