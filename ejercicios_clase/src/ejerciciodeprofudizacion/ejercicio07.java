package ejerciciodeprofudizacion;
import java.util.Scanner;

public class ejercicio07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dame un numero entero positivo");
		int num=input.nextInt();
		String asteriscos="**********";
		for(int i=1;i<=num;i++) {
			System.out.println(asteriscos);
		}
		input.close();
		}
}
