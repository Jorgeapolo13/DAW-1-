package ejerciciodeprofudizacion;
import java.util.Scanner;

public class ejercicio09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean repetir=true;
		char opcion;
		do {
			System.out.println("Dame un numero positivo mayor que cero y te digo si es par o impar");
			int num=input.nextInt();
			if(num%2==0){
				System.out.println("El numero es par");
			}
			else {
				System.out.println("El numero es impar");
			}
			System.out.println("Desea repetir el proceso? Y/N");
			opcion = input.next().charAt(0);
			if(opcion=='N'){
					repetir=false;
			}
		}while(repetir);
		input.close();
		}
}
