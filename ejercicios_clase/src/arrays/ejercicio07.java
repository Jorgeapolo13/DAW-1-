package arrays;

class ejercicio07 {

	public static void main(String[] args) {
		int[] a={1,66,15,33,2,34,65,39,15,78};
		int[] resultado;
		resultado= altenarPositivosyNegativos(a);
		System.out.println("El original es:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" -> ");
		}
		System.out.println();
		System.out.println("Convertido:");
		for(int i=0;i<resultado.length;i++) {
			System.out.print(resultado[i]+" -> ");
		}
	}
	public static int[] altenarPositivosyNegativos(int[] a) {
		int[] resultado= new int [10]; 
		for(int i=0;i<resultado.length;i++) {
			if(i%2==0) {
				resultado[i]=a[i];
			}else {
				resultado[i]=-a[i];
			}				
		}
		return resultado;
	}
}
