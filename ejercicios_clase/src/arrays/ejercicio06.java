package arrays;
import java.util.Scanner;
class ejercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int cont=3;
		System.out.println("Elige el tamaño del array");
		int tamaño=input.nextInt();
		int [] miArray= new int [tamaño];
		for(int i=0;i<miArray.length;i++) {
			miArray[i]=cont;
			cont+=2;
		}
		for(int i=0;i<miArray.length;i++) {
			System.out.print(miArray[i]+"--");
		}
		input.close();
	}

}
