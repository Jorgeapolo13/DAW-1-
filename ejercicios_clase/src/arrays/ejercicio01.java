package arrays;
import java.util.Random;
class ejercicio01 {

	public static void main(String[] args) {
		int [] miArray= new int [10];
		Random rand = new Random();
		for(int i=0;i<miArray.length;i++) {
			miArray[i]=rand.nextInt(100) + 1;
		}
		if(miArray[0]==miArray[9]) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
	}
}
