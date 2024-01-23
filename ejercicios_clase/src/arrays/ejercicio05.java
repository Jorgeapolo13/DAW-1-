package arrays;

class ejercicio05 {

	public static void main(String[] args) {
		int [] a={1,66,15,33,2,34,65,39,15,78};
		int numeroMayor=mayor(a);
		System.out.println("El numero mas grande del array es: "+numeroMayor);
	}
	public static int mayor(int [] a) {
		int mayor=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>mayor) {
				mayor=a[i];
			}
		}
		return mayor;
	}
}
