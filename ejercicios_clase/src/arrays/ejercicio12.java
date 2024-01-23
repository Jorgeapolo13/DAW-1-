package arrays;
import java.util.Random;
import java.util.Scanner;
class ejercicio12 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int[] a = new int[10];
		int min, max;
		rellenarArray(a);
		System.out.println("Introduce la posicion desde donde empezar. Debe ser entre 0 y 9");
		do {
			min=input.nextInt();
		} while (min>0&&min<=9);
		System.out.println("Introduce la posicion donde acabar. Deber ser entre 0 y 9 y mayor al min");
		do {
			max=input.nextInt();
		} while (max<0&&max>10);
		System.out.println("La suma de los valores recogidos en el rango indicado es: "+sumarValores(min, max, a));
		input.close();
	}
	public static void rellenarArray(int []a) {
		Random random = new Random();
		for(int i=0;i<a.length;i++) {
			a[i]=random.nextInt(100)+1;
		}
	}
	public static int sumarValores(int min, int max, int []a) {
		int ac=0;
		for(int i=min;i<max;i++) {
			ac+=ac;
		}
		return ac;
	}
}
