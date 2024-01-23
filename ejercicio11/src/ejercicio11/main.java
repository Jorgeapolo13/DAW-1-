package ejercicio11;

import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		GestionVehiculo vehiculos= new GestionVehiculo();
		
		System.out.println("Dime un consumo a filtrar");
		vehiculos.filtrarPorConsumo(sc.nextDouble());
		
		//vehiculos.mostrarTodos();
		
		System.out.printf("El precio medio del alquiler es: %.2f\n",vehiculos.precioMedioAlquiler());
	}

}
