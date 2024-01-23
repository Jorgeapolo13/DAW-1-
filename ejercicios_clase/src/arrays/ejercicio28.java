package arrays;
import java.util.Random;
class ejercicio28 {
	static Random rd = new Random();
	public static void main(String[] args) {
		int [][] m= new int[5][5];
		rellenarMatriz(m);
		mostrarMatriz(m);
		sumarDiagonales(m);
	}
	public static void rellenarMatriz(int [][] m) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]=rd.nextInt(9)+1;
			}
		}
	}
	public static void sumarDiagonales(int [][] m) {
		int ac=0;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(i==j) {
					ac+=m[i][j];
				}
			}
		}
		System.out.println("La diagonal de arriba a abajo sumada es:"+ac);
		ac=0;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if((i+j)==4) {
					ac+=m[i][j];
				}
			}
		}
		System.out.println("La diagonal de abajo a arriba sumada es:"+ac);
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
