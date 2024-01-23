package prueba17NOV;
import java.util.Random;
class ejercicio01 {

	public static void main(String[] args) {

		int [] a=new int [5];
		int [] pares= new int[5];
		int [] impares= new int[5];
		rellenarArray(a,pares,impares);
		System.out.println("Array original");
		mostrarArray(a);
		System.out.println("Array con numeros pares");
		mostrarArray(pares);
		System.out.println("Array con numeros impares");
		mostrarArray(impares);
	}
	public static void rellenarArray(int [] a, int [] pares, int [] impares) {
		int contPares=0,contImpares=0;
		Random rand= new Random();
		for(int i=0;i<a.length;i++) {
			a[i]=rand.nextInt(100)+1;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				pares[contPares]=a[i];
				contPares++;
			}else {
				impares[contImpares]=a[i];
				contImpares++;
			}
		}
	}
	public static void mostrarArray(int [] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				System.out.println("Posicion "+(i+1)+": "+a[i]);
			}

		}
	}
}
