package examen1Evaulacion;

import java.util.Scanner;

class ejercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);//Clase scanner
		
		System.out.println("Introduzca una palabra secreta y luego intente adivinar la palabra secreta.");
		String palabraSecreta=input.next().toUpperCase();//Pedimos al usuario que introduzca la palabra secreta transformando las letras en mayusculas para que no haga distinciones
		
		boolean adivinado=false;//Creamos e inicializamos las variables
		String cadena;
		int i=3;
		
		System.out.println("Intente adivinar la palabra secreta que ha introducido el otro usuario. El programa no diferenciara entre mayusculas y minusculas.");
		do {
			
			System.out.println(i+" Intentos");
			cadena=input.next().toUpperCase();//Volvemos a pedir la palabra para ver si la acierta con el mismo procedimiento que el anterior
			
			if(palabraSecreta.equals(cadena)) {//Usamos la clase String para comprobar si son iguales
				adivinado=true;
				System.out.println("Lo has adivinado, enhorabuena!");
			}else {
				System.out.println("Has fallado :(");
				i--;//Vamos restando el numero de intentos
			}
		}while(!adivinado && i>0 );//Si lo adivina lo saca del programa e igualmente si sobrepasa el numero de intentos
		
		System.out.println("Adios");
		
		input.close();//Cerramos la clase Scanner
	}
}
