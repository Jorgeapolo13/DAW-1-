package ejerciciodeprofudizacion;
import java.util.Scanner;
class ejercicio22 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int ac=0,num;
		boolean salir=true;
		do {
			System.out.println("Dame un numero y lo acumulo, si desea parar el programa teclee 0");
			num=input.nextInt();
			if(num==0) {
				salir=false;
			}
			else {
				ac+=num;
			}
		} while (salir);
		System.out.println("Suma de los numero tecleados: "+ac);
		System.out.println("Adios!");
		input.close();
	}

}
