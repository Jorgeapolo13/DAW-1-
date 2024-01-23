package arrays;
import java.util.Random;
import java.util.Scanner;
class ejercicio25 {
	static Random random= new Random();
	static Scanner input= new Scanner(System.in);
	public static void main(String[] args) {
		double[][] notas= new double[20][3];
		String[] alumnos=new String [20];
		double media;
		 for(int i=0;i<alumnos.length;i++) {
			 alumnos[i]="Alumno "+(i+1);
		 }
		 rellenarMatriz(notas);
		 for(int i=0;i<notas.length;i++) {
			 media=0.0;
			 System.out.print(alumnos[i]+": ");
				for(int j=0;j<notas[i].length;j++) {
					media+=notas[i][j];
					System.out.printf("%.2f  ",notas[i][j]);
				}
				media=media/notas[i].length;
				System.out.printf("La media del alumno %d es %.2f%n%n",(i+1),media);
			}
	}
	public static void rellenarMatriz(double[][] notas) {
		for(int i=0;i<notas.length;i++) {
			for(int j=0;j<notas[i].length;j++) {
				notas[i][j]=1 + random.nextDouble() * 9;
			}
		}
	}
}
