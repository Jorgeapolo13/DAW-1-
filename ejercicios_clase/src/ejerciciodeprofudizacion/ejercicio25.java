package ejerciciodeprofudizacion;
import java.util.Scanner;
class ejercicio25 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Dame un numero real");
		Double num=input.nextDouble();
		Double ac=0.0;
		for(int i=1;i<=10;i++) {
			ac+=(num/i);
		}
		System.out.println(ac);
		input.close();
	}

}
