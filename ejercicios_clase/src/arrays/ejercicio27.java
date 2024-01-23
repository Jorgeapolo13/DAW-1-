package arrays;
import java.util.Random;
import java.util.Scanner;
class ejercicio27 {
	static Random rd=new Random();
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		String[][] alumnos = {
	            {"Juan Pérez", "123456789A"},
	            {"María González", "987654321B"},
	            {"Carlos Rodríguez", "567890123C"},
	            {"Laura Sánchez", "345678901D"},
	            {"Pedro Martínez", "789012345E"},
	            {"Ana López", "234567890F"},
	            {"David García", "456789012G"},
	            {"Elena Fernández", "890123456H"},
	            {"Alejandro Ruiz", "678901234I"},
	            {"Isabel Torres", "012345678J"}
	        };
		int [][] notas= new int[10][3];
		rellenarMatriz(notas);
		mostrarMatrizEntera(alumnos,notas);
		System.out.println("Inserte el dni del alumno:");
		String dni=input.next();
		mostrarMatriz(alumnos, notas, dni);
	}
	
	public static void rellenarMatriz(int [][] m) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]=rd.nextInt(11);
			}
		}
	}
	
	public static void mostrarMatriz(String[][] alumnos,int [][] m, String dni) {
		
		for(int i=0;i<alumnos.length;i++) {
			
				if(dni.equals(alumnos[i][1])) {
					System.out.print(alumnos[i][0]+": ");
					
					for(int e=0;e<m[e].length;e++) {
						System.out.print(m[i][e]+" ");
					}
					break;
				}
		}
		System.out.println();
	}
	
	public static void mostrarMatrizEntera(String[][] alumnos,int [][] m) {
		for(int i=0;i<alumnos.length;i++) {
			System.out.print(alumnos[i][0]+" "+alumnos[i][1]+": ");
			for(int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
}
