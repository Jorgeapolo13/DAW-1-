package arrays;

import java.util.Random;
public class ejercicio02  {
	public static void main(String[] args) {
		int [] miArray= new int [10];
		Random rand = new Random();
		for(int i=0;i<miArray.length;i++) {
			miArray[i]=rand.nextInt(10) + 1;
		}
		int i=0;
		while(i<miArray.length) {
			System.out.println(miArray[i]);
			i++;
		}
	}
}