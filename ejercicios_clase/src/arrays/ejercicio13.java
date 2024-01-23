package arrays;
import java.util.Scanner;
class ejercicio13 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int dia;
		String [] diasSemana= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		do {
			System.out.println("Introduce un numero y te digo el dia de la semana a la cual pertenece. Si desea salir del programa introduce un cero");
			dia=input.nextInt();
			if(dia!=0) {
				System.out.println("El dia correspondiente a ese numero es el: "+diasSemana[dia-1]);
			}
		}while(dia!=0);
		input.close();
	}

}
