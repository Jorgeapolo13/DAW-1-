package clase23octubre;

import java.util.Scanner;

class adivinanumero {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 boolean salir=false;
		 int numAl= (int)((Math.random()*100)+1);
		 int num;
		 while(!salir) {
			 System.out.println("Intenta adivinar un numero del 1 al 100");
			 num=input.nextInt();
			 if(num==numAl) {
				 System.out.println("Enhorabuena, lo has adivinado!");
				 salir=true;
			 }else {
				 if(num<numAl) {
					 System.out.println("Es mayor");
				 }else {
					 System.out.println("Es menor");
				 }
			 }
		 }
		 input.close();
	 }
	        
}
