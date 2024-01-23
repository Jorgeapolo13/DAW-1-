package examen1Evaulacion;

import java.util.Scanner;

class ejercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);//Clase scanner
		
		System.out.println("Introduzca dos numeros enteros mayores que 0");
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		int mayor=maxDivisor(num1,num2);//Llamamos a la funcion que hemos creado que nos devuelve un entero con el maximo comun divisor
		
		System.out.println("El maximo comun divisor de los dos numeros introducidos es "+mayor);
		
		input.close();//Cerramos la clase Scanner
	}
	
	public static int maxDivisor(int num1, int num2) {
		int aux;
		
		if(num1<=num2) {//Ponemos en orden los numeros para el correcto uso del programa
			aux=num1;
			num1=num2;
			num2=aux;
		}
		
		int mayor=1;
		for(int i=2;i<num2;i++) {//Creamos un bucle que compruebe los numeros hasta el menor de los dos
			if((num1%i==0) && (num2 % i==0)) {
				mayor=i;
			}
		}
		
		return mayor;
	}
}
