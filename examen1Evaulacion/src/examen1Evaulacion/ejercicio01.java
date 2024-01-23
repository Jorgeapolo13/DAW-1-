package examen1Evaulacion;

import java.util.Scanner;

class ejercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);//Clase scanner
		
		boolean salir=false;//Bandera
		int num;//Creamos e inicializamos las variables
		
		do {
			
			System.out.println("Introduzca un numero y te dire si es par o impar. Si desea salir del programa introduzca un 0");
			num=input.nextInt();//Introducimos un numero 
			
			if(num!=0) {
				if(esNumPar(num)) {//Llamamos a nuestra funcion esPar que nos devuelve true si es par y false si es imPar
					System.out.println("Es par");
				}else {
					System.out.println("Es impar");
				}
			}else {
				salir=true;//Si el usuario introduce un 0 salimos del bucle activando nuestra bandera
				System.out.println("Adios");
			}
			
		} while (!salir);
		
		input.close();//Cerramos la clase Scanner
	}
	public static boolean esNumPar(int num) {
		boolean esPar=false;
		
		if(num%2==0) {//Si es divisible entre significara que es par si no impar
			esPar=true;
		}
		
		return esPar;
	}
}
