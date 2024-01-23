package ejerciciodeprofudizacion;

import java.util.Random;

class ejercicio47 {

	public static void main(String[] args) {
		Random random = new Random();
		int num;
		int mayor=0;
		for(int i=0;i<10;i++) {
			num=random.nextInt(1,51);
			System.out.println("El numero "+(i+1)+" generado es "+num);
			if(num>=mayor) {
				mayor=num;
			}
		}
		System.out.println("El mayor numero generado aleatoriamente es "+mayor);
	}

}
