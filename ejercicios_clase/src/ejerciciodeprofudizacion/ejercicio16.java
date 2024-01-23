package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean salir=true;
		int num1, num2;
		char opcion;
		do {
			System.out.println("Dame dos numeros enteros positivos");
			num1=input.nextInt();
			num2=input.nextInt();
			if (num1%num2==0) {
				System.out.println("El numero 2 es divisor de "+num1+" ya que al dividir "+num1+" entre "+num2+" el resto de la division es cero");
			}
			System.out.println("Desea repetir el proceso? Y/N");
			opcion = input.next().charAt(0);
			if(opcion=='N'){
					salir=false;
					System.out.println("Adios");
			}
		} while (salir);
		
		
		
		input.close();
	}

}
