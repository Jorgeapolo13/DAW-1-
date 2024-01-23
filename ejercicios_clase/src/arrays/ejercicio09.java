package arrays;

import java.util.Scanner;

class ejercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [] a= {1,66,15,33,2,34,65,39,15,78};
		System.out.println("Introduce un valor y te digo en la primera posicion que aparezca en el array y cuantas veces aparece");
		int num=input.nextInt();
		System.out.println("La primera posicion en la cual aparece es la: "+buscarNumero(num,a));
		System.out.println("El numero de veces que aparece es: "+contarNumero(num, a));
		input.close();
	}
	public static int buscarNumero(int num, int [] a) {
		int result=-1;
		for(int i=0; i<a.length;i++) {
			if(num==a[i]) {
				result=i;
				break;
			}
		}
		return result;
	}
	public static int contarNumero(int num, int [] a) {
		int cont=0;
		for(int i=0; i<a.length;i++) {
			if(num==a[i]) {
				cont++;
			}
		}
		return cont;
	}
}
