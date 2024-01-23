package clase5octubre;
import java.util.Scanner;
class ejercicio2 {
	public static void main(String[] args) {
	   	Scanner input = new Scanner(System.in);
	   	System.out.println("Introduce un numero positivo");
	   	int num=input.nextInt();
	   	while(num>0) {
	   		num=num*num;
		   	System.out.println("El cuadrado es "+num+", introduzca otro");
		   	num=input.nextInt();
	   	}
	   	input.close();
	}
}