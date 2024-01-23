package ejerciciodeprofudizacion;
import java.util.Scanner;

public class ejercicio06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dame un numero entero positivo");
		int num=input.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
		input.close();
		}
}
