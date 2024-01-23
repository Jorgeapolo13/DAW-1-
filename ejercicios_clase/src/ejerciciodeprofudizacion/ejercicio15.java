package ejerciciodeprofudizacion;
import java.util.Scanner;
public class ejercicio15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean salir=false;
		int i;

		do {
			System.out.println("Menu:");
			System.out.println("1. Pares");
			System.out.println("2. Impares");
			System.out.println("3. Salir");
			System.out.println("Selecciona una opcion");
			int opcion=input.nextInt();
			switch(opcion) {
				case 1:
					System.out.println("Pares del 40 al 60:");
					for(i=40;i<=60;i+=2) {
						System.out.println(i);
					}
					break;
				case 2:
					System.out.println("Impares del 99 al 77:");
					for(i=99;i>=77;i-=2) {
						System.out.println(i);
					}
					break;
				case 3:
					salir=true;
					break;
				default:
					System.out.println("ERROR");
					break;
			}		
		}while(!salir);
		input.close();
	}

}
