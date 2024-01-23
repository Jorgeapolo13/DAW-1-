package arrays;
import java.util.Random;
class ejercicio19 {

	public static void main(String[] args) {
		Random random= new Random();
		int[] tiradas = {0, 0, 0, 0, 0, 0};
		int num;
		for(int i=0;i<6000;i++) {
			num=random.nextInt(6)+1;
			tiradas[num-1]++;
		}
		for(int i=0;i<tiradas.length;i++) {	
			System.out.println("El numero de tiradas en las que ha salido "+(i+1)+" son "+ tiradas[i]);
			System.out.printf("El porcetanje de que salga %d ha sido %.2f%%.   %n",(i+1),(tiradas[i]/6000.0)*100);
		}
	}
}
