package ejerciciodeprofudizacion;

import java.util.Random;

class ejercicio49 {

	public static void main(String[] args) {
		Random random = new Random();
		int num,pos=0,neg=0;
		for(int i=1;i<=10;i++) {
			num=random.nextInt();
			if(num>=0) {
				pos++;
			}else {
				neg++;
			}
		}
		System.out.println("El numero de numeros positivos generados son "+pos);
		System.out.println("El numero de numeros negativos generados son "+neg);
	}
}
