package arrays;
import java.util.Scanner;

class ejercicio14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mes;
		do {
			System.out.println("Introduce un numero del 1 al 12 y te muestro el mes correspondiente a ese numero. Si desea salir introduzca un 0");
			mes=input.nextInt();
			if(mes!=0) {
				System.out.println(mesesDelAño(mes));
			}
		}while(mes!=0);
		
		input.close();
	}
	public static String mesesDelAño(int mes) {
		String[] meses = {
	            "Enero", "Febrero", "Marzo", "Abril",
	            "Mayo", "Junio", "Julio", "Agosto",
	            "Septiembre", "Octubre", "Noviembre", "Diciembre"
	    };
		return meses[mes-1];
	}
}
