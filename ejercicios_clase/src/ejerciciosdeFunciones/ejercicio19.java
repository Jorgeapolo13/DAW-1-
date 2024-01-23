package ejerciciosdeFunciones;

import java.util.Date;

class ejercicio19 {

	public static void main(String[] args) {
		Date fecha = new Date();
		boolean salir=false;
		do {
			String fechaActual= fecha.toString();
			System.out.println(fechaActual);
		} while (!salir);
	}

}
