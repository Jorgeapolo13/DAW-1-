package ProyectoPizzeria;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionPizzas {
	static Scanner input=new Scanner(System.in);
	private ArrayList<Pizza> Pizzas = new ArrayList<>();
	public GestionPizzas() {
		boolean salir=false;
		do {
			System.out.println("Seleccione una opcion: \n"
					+ "1.Añadir pizza \n"
					+ "2.Mostrar todas las pizzas añadidas \n"
					+ "3.Calcular precio \n"
					+ "4.Pagar ");
			switch(input.nextInt()) {
				case 1:
					Pizza p=new Pizza(seleccionMasa(),seleccionBase(),seleccionIngredientes());
					Pizzas.add(p);
					break;
				case 2:
					mostrarPizzas();
					break;
				case 3:
					System.out.println("El precio de la comanda es: "+calcularPrecio());
					break;
				case 4:
					salir=true;
					break;
				default:
					System.out.println("ERROR");
			}
		}while(!salir);
	}
	public int menuPizza() {
		int opcion=0;
		boolean salir=false;
		do {
			System.out.println("Seleccione una opcion: \n"
					+ "1.Pizza Familiar. 13.95€ (5 Ingredientes) \n"
					+ "2.Pizza Mediana. 9.95€ (3 Ingredientes) \n"
					+ "3.Pizza Individual. 5.95€ (2 Ingredientes) \n");
			switch(input.nextInt()) {
			case 1:
				opcion=5;
				salir=true;
				break;
			case 2:
				opcion=3;
				salir=true;
				break;
			case 3:
				opcion=2;
				salir=true;
				break;
			default:
				System.out.println("ERROR");
			}
		}while(!salir);
		return opcion;
	}
	public String[] seleccionIngredientes() {
		int numIngredientes;
		String[] ingredientes=new String[numIngredientes=menuPizza()];
		for(int i=0;i<numIngredientes;i++) {
			System.out.println("Te quedan: "+(numIngredientes-i)+" ingredientes a elegir");
			ingredientes[i]=input.next();
		}
		return ingredientes;
	}
	public String seleccionBase() {
		boolean salir=false;
		String opcion="";
		do {
			System.out.println("Seleccione una opcion: \n"
					+ "1.Tomate \n"
					+ "2.Carbonara \n"
					+ "3.Barbacoa");
			switch(input.nextInt()) {
				case 1:
					opcion="Tomate";
					salir=true;
					break;
				case 2:
					opcion="Carbonara";
					salir=true;
					break;
				case 3:
					opcion="Barbacoa";
					salir=true;
					break;
				default:
					System.out.println("ERROR");
			}
		}while(!salir);
		return opcion;
	}
	public String seleccionMasa() {
		boolean salir=false;
		String opcion="";
		do {
			System.out.println("Seleccione una opcion: \n"
					+ "1.Fina \n"
					+ "2.Clasica \n");
			switch(input.nextInt()) {
				case 1:
					opcion="Fina";
					salir=true;
					break;
				case 2:
					opcion="Clasica";
					salir=true;
					break;
				default:
					System.out.println("ERROR");
			}
		}while(!salir);
		return opcion;
	}
	public void mostrarPizzas() {
		int i=0;
		for(Pizza p: Pizzas) {
			System.out.println("Pizza "+(i+1)+": \n"
					+ "Masa: "+p.getMasa()+"\n"
					+ "Base: "+p.getBase());
			mostrarIngredientes(p.getIngredientes());
			i++;
		}
	}
	public void mostrarIngredientes(String [] ingredientes) {
		for(int i=0;i<ingredientes.length;i++) {
			System.out.println("Ingrediente "+(i+1)+": "+ingredientes[i]);
		}
	}
	public double calcularPrecio() {
		double precio=0.0;
		for(Pizza p: Pizzas) {
			switch (p.ingredientes.length) {
				case 2:
					precio+=5.95;
					break;
				case 3:
					precio+=9.95;
					break;
				case 5:
					precio+=13.95;
					break;
			}
		}
		return precio;
	}
}
