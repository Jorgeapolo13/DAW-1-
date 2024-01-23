package examen1Evaulacion;

import java.util.Scanner;

class ejercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);//Clase scanner
		
		int num, acPos=0, acNeg=0, cont0=0, contPos=0,contNeg=0;//Creamos e inicializamos las variables
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Introduzca un entero");
			num=input.nextInt();
			
			if (num==0) {
				cont0++;//Sumamos el contador si se ha introducido el numero deseado
			} else {
				if(num>0){
					acPos+=num;//Lo sumamos al acumulador
					contPos++;
				}else {
					acNeg+=num;
					contNeg++;
				}
			}
		}
		if(contPos>0) {contPos=acPos/contPos;}//Hacemos la media pero antes comprobamos si se ha introducido un 0 
		if(contNeg>0) {contNeg=acNeg/contNeg;}
		
		System.out.println("La media de los numeros positivos es "+contPos);
		System.out.println("La media de los numeros negativos es "+contNeg);
		System.out.println("El numero de 0 introducidos es "+cont0);
		
		input.close();//Cerramos la clase Scanner
	}
}
