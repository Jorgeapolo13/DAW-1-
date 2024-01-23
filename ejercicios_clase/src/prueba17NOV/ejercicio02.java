package prueba17NOV;

class ejercicio02 {

	public static void main(String[] args) {
		int [][] m=new int[5][5];

		rellenarMatriz(m);
		System.out.println("Matriz original:");
		mostrarMatriz(m);

		rellenarMatriz1(m);
		System.out.println("Matriz con su diagonal modificada:");
		mostrarMatriz(m);
	}
	public static void rellenarMatriz(int [][] m) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]=i+j;
			}
		}
	}
	public static void rellenarMatriz1(int [][] m) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(i==j) {
					m[i][j]=1;
				}
			}
		}
	}
	public static void mostrarMatriz(int [][] m) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
