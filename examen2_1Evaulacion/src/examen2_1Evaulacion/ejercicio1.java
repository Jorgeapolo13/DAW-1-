package examen2_1Evaulacion;

import java.util.Random;
import java.util.Scanner;

class ejercicio1 {
	static Scanner input=new Scanner(System.in);
	static Random rd = new Random();
	static int[][] m;
	public static void main(String[] args) {
		boolean salir=false,creado=false;
		int ancho, largo, num;
		do {
			switch (mostrarMenu()) {
				case 1:
					System.out.println("Dame el ancho de la matriz");
					ancho=input.nextInt();
					System.out.println("Dame el largo de la matriz");
					largo=input.nextInt();
					m=new int[ancho][largo];
					rellenarMatriz();
					mostrarMatriz();
					creado=true;
					break;
				case 2:
					if(creado) {
						contarImpares();
					}else {
						System.out.println("Debes haber creado antes la matriz");
					}
					break;
				case 3:
					if(creado) {
						maximoMinimo();
					}else {
						System.out.println("Debes haber creado antes la matriz");
					}
					break;
				case 4:
					if(creado) {
						diagonalCero();
					}else {
						System.out.println("Debes haber creado antes la matriz");
					}
					break;
				case 5:
					if(creado) {
						System.out.println("Dame un numero para buscarlo en la matriz");
						num=input.nextInt();
						buscarMatriz(num);
					}else {
						System.out.println("Debes haber creado antes la matriz");
					}
					break;
				case 6:
					salir=true;
					System.out.println("Adios");
					break;
				default:
					System.out.println("ERROR");
					break;
			}
		}while(!salir);

	}
	public static int mostrarMenu() {
		int eleccion;
		System.out.println("1. Generar");
		System.out.println("2. Calcular número de impares");
		System.out.println("3. Calcular máximo y mínimo");
		System.out.println("4. Diagonal en cero");
		System.out.println("5. Busca");
		System.out.println("6. Salir");
		eleccion=input.nextInt();
		return eleccion;
	}
	public static void rellenarMatriz() {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]=rd.nextInt(100)+1;
			}
		}
	}
	public static void contarImpares() {
		int cont=0;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(m[i][j]%2!=0) {
					cont++;
				}
			}
		}
		System.out.println("Hay un total de "+cont+" impares");
	}
	public static void mostrarMatriz() {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.printf(m[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void maximoMinimo() {
		int max=0,min=m[0][0];
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(m[i][j]>max) {
					max=m[i][j];
				}else if(m[i][j]<min){
					min=m[i][j];
				}
			}
		}
		System.out.println("El maximo numero de la matriz es "+max);
		System.out.println("El minimo numero de la matriz es "+min);
	}
	public static void diagonalCero() {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(i==j) {
					m[i][j]=0;
				}
			}
		}
	}
	public static void buscarMatriz(int num) {
		int cont=0;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(m[i][j]==num) {
					cont++;
				}
			}
		}
		System.out.println("El numero de veces que se repite es "+cont);
	}
}
