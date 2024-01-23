package ejerciciodeprofudizacion;
import java.util.Scanner;

public class ejercicio05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dame un numero del 1 al 100");
		int numero=input.nextInt();
		if (numero >= 1 && numero <= 10) {
			for(int i=1;i<=10;i++) {
				System.out.println(i*numero);
			}
		}
		else {
			System.out.println("ERROR");
		}
		input.close();
		}
}