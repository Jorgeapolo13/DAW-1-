package examen1Evaulacion;

import java.util.Scanner;

class ejercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);//Clase scanner
		
		System.out.println("Introduzca un numero entero entre el 0 y el 9999");
		int num=input.nextInt();
		
		int dig;
		
		while(num>0) {//El bucle se ejecutara hasta que el numero se reduzca por completo
			dig=num%10;//Extraemos el ultimo digito del numero
			System.out.print(dig);//Y lo mostramos
			num=num/10;//Luego vamos reduciendo el numero
		}
		
		input.close();//Cerramos la clase Scanner
	}

}
