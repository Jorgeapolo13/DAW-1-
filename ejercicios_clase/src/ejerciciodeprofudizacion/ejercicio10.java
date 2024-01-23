package ejerciciodeprofudizacion;
import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=20;i++) {
			System.out.println("El cubo de "+i+" es: "+i*i);
		}
		input.close();
		}
}