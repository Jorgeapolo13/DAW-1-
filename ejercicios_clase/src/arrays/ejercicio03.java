package arrays;

import java.util.Iterator;

class ejercicio03 {

	public static void main(String[] args) {
		int [] a={1,66,15,33,2,34,65,39,15,78};
		int aux;
		for(int i=0; i<a.length/2;i++) {
			aux=a[i];
			a[i]=a[a.length-(i+1)];
			a[a.length-(i+1)]=aux;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
