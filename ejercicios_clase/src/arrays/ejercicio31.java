package arrays;

class ejercicio31 {

	public static void main(String[] args) {
		int[] a = { 10, 25, 7, 42, 5, 38, 14, 3, 49, 21, 6, 33, 17, 2, 48, 11, 30, 9, 45, 1 };
		mostrarArray(a);
		ordenarArray(a);
		mostrarArray(a);
	}
	public static void ordenarArray(int[] a) {
		int aux;
		boolean ordenado;
		for(int i=0;i<a.length;i++) {
			ordenado=true;
			for(int j=0;j<(a.length-1);j++) {
				if(a[j]>a[j+1]) {
					aux=a[j];
					a[j]=a[j+1];
					a[j+1]=aux;
					ordenado=false;
				}
			}
			if(ordenado==true) {
				break;
			}
		}
	}
	public static void mostrarArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
