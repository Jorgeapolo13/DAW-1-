package clase5octubre;
import java.util.Scanner;
class ejercicio1 {
	public static void main(String[] args) {
	   	Scanner input = new Scanner(System.in);
	   	System.out.println("Dame tu clasificacion en el examen");
	   	int nota=input.nextInt();
	   	switch(nota) {
	   	case 0, 1, 2, 3, 4:
	   		System.out.println("Insuficiente");
	   		break;
	   	case 5:
	   		System.out.println("Suficiente");
	   		break;
	   	case 6:
	   		System.out.println("Bien");
	   		break;
	   	case 7,8:
	   		System.out.println("Notable");
	   		break;
	   	case 9, 10:
	   		System.out.println("Sobresaliente");
	   		break;
	   	default:
	   		System.out.println("Nota fuera de rango");
	   		break;
	   	}
	   	
	   	input.close();
	}
}
