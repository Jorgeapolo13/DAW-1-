package ejerciciosdeFunciones;

class ejercicio16 {

	public static void main(String[] args) {
		serieFibonacci(20);

	}
	public static void serieFibonacci(int max) {
		int ant=0, num=1,suma;
		for(int i=0;i<max;i++) {
			suma=num+ant;
			System.out.println(num);
			ant=num;
			num=suma;
		}
	}
}
