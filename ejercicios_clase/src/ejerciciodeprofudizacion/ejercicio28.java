package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio28 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Dame dos numeros enteros positivos");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int ac1=0,ac2=0;
		for(int i=1;i<num1;i++) {
			if(num1%i==0) {
				ac1+=i;
			}
		}
		for(int i=1;i<num2;i++) {
			if(num2%i==0) {
				ac2+=i;
			}
		}
		if(ac2==num1&&ac1==num2) {
			System.out.println("¡Son numeros amigos!");
		}else {
			System.out.println("No son numeros amigos :(");
		}
		input.close();
	}

	}

