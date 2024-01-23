package ejerciciodeprofudizacion;

import java.util.Random;

class ejercicio48 {

	public static void main(String[] args) {
		Random random = new Random();
		int num;
		int mayor=0;
		int menor=51;
		for(int i=0;i<10;i++) {
			num=random.nextInt(1,51);
			System.out.println("El numero "+(i+1)+" generado es "+num);
			if(num>=mayor) {
				mayor=num;
			}
			if (num<=menor) {
				menor=num;
			}
		}
		System.out.println("El mayor numero generado aleatoriamente es "+mayor+" y el menor es "+menor);
	}
}


