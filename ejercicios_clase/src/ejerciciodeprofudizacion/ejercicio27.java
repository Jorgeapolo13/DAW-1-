package ejerciciodeprofudizacion;
import java.util.Scanner;
class ejercicio27 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Dame un numero entero positivo");
		int num=input.nextInt();
		int ac=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				ac+=i;
			}
		}
		if (ac==num) {
			System.out.println("¡Es un numero perfecto!");
		}else {
			System.out.println("No es un numero perfecto :(");
		}
		input.close();
	}

}
