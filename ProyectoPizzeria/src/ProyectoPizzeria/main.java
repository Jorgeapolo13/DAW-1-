package ProyectoPizzeria;

import java.util.Scanner;

public class main {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		boolean salir=false;
		System.out.println("Bienvenido!!");
		do {
			GestionPizzas pizzas=new GestionPizzas();
			System.out.println("Desea crear otra comanda? S/N");
			if(input.next().toUpperCase().charAt(0)=='N') {
				salir=true;
			}
		}while(!salir);
	}
}
