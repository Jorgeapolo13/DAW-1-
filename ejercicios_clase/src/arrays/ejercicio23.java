package arrays;

class ejercicio23 {

	public static void main(String[] args) {
		int [][] m = {{2,4,5,6,7},{4,2,2,1,1},{5,6,7,8,8,10,12}};
		int ac,mayor=0;
		for(int i=0; i<m.length;i++) {
			ac=0;
			for(int j=0;j<m[i].length;j++) {
				ac+=m[i][j];
				if(m[i][j]>mayor) {
					mayor=m[i][j];
				}
				System.out.print(m[i][j]+"  ");
			}
			System.out.print("La suma de esta fila es: "+ac);
			System.out.println();
		}
		System.out.println("El mayor de los valores de la matriz es: "+mayor);
	}

}
