package ejerciciodeprofudizacion;

import java.util.Scanner;

class ejercicio32 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Dame un año");
		int año=input.nextInt();
		System.out.println("Dame un mes");
		int mes=input.nextInt();
		int dias=0;
		boolean bisiesto=false;
		if(año%4==0) {
			if(año%100!=0) {
				bisiesto=true;
			}
		}else {
			if(año%400==0) {
				bisiesto=true;
			}
		}
		switch(mes) {
			case 1:
				dias=31;
				break;
			case 2:
				if(bisiesto) {
					dias=29;
				}
				else {
					dias=28;
				}
				break;
			case 3:
				dias=31;
				break;
			case 4:
				dias=30;
				break;
			case 5:
				dias=31;
				break;
			case 6:
				dias=30;
				break;
			case 7:
				dias=31;
				break;
			case 8:
				dias=31;
				break;
			case 9:
				dias=30;
				break;
			case 10:
				dias=31;
				break;
			case 11:
				dias=30;
				break;
			case 12:
				dias=31;
				break;
			default:
				System.out.println("ERROR");
				break;
		}
		System.out.println("En el año "+año+" el mes "+mes+" tenia: "+dias+" dias.");
		input.close();;
	}

}
