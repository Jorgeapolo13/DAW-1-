package ejercicio11;

import java.util.ArrayList;
import java.util.Random;

public class GestionVehiculo {
	private static Random random = new Random();
	private ArrayList<Vehiculo> Vehiculos = new ArrayList<>();
	
	public GestionVehiculo() {
		for(int i=0;i<10;i++) {
			Vehiculo v = new Vehiculo(generarMatricula(), obtenerMarcaAleatoria(), obtenerModeloAleatorio(), obtenerPotenciaAleatioria(), obtenerConsumoAleatorio(), obtenerPrecioAlqDiarioAleatorio() );
			Vehiculos.add(v);
		}
	}
	
	private static String generarMatricula() {
        // Números posibles para la parte numérica
        String numeros = "0123456789";

        // Letras posibles para la parte alfabética 
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Generar la parte numérica 
        StringBuilder parteNumerica = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int indiceNumero = random.nextInt(numeros.length());
            parteNumerica.append(numeros.charAt(indiceNumero));
        }
        
        // Generar la parte alfabética
        StringBuilder parteAlfabetica = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int indiceLetra = random.nextInt(letras.length());
            parteAlfabetica.append(letras.charAt(indiceLetra));
        }

        // Combinar las partes numérica y alfabética para formar la matrícula
        return parteNumerica.toString() + parteAlfabetica.toString();
    }
	
	// Método para obtener una marca de coche aleatoria
    private static String obtenerMarcaAleatoria() {
    	// Array de marcas de coches
        String[] marcas = {
            "Toyota", "Honda", "Ford", "Chevrolet", "Volkswagen",
            "Nissan", "BMW", "Mercedes-Benz", "Audi", "Tesla",
            "Hyundai", "Kia", "Mazda", "Subaru", "Ferrari",
            "Lamborghini", "Porsche", "Jaguar", "Land Rover", "Volvo"
        };

        // Verificar si el array de marcas no está vacío
        if (marcas != null && marcas.length > 0) {
            int indiceAleatorio = random.nextInt(marcas.length);

            // Devolver la marca de coche en el índice aleatorio
            return marcas[indiceAleatorio];
        } else {
            // Devolver un mensaje si el array está vacío
            return "No hay marcas de coche disponibles";
        }
    }
    
 // Método para obtener un modelo de coche aleatorio
    private static String obtenerModeloAleatorio() {
    	// Array de modelos de coches
        String[] modelos = {
            "Corolla", "Civic", "F-150", "Camaro", "Golf",
            "Altima", "3 Series", "E-Class", "A4", "Model S",
            "Elantra", "Soul", "CX-5", "Outback", "488 GTB",
            "Huracán", "911", "F-Type", "Range Rover", "XC90"
            // Puedes agregar más modelos según tus necesidades
        };

        // Verificar si el array de modelos no está vacío
        if (modelos != null && modelos.length > 0) {
            int indiceAleatorio = random.nextInt(modelos.length);

            // Devolver el modelo de coche en el índice aleatorio
            return modelos[indiceAleatorio];
        } else {
            // Devolver un mensaje si el array está vacío
            return "No hay modelos de coche disponibles";
        }
    }
    
    private static double obtenerConsumoAleatorio() {
    	return 2.0 + (15.0+2.0)* random.nextDouble();
    }
    
    private static int obtenerPotenciaAleatioria() {
    	return random.nextInt(381)+20;
    }
    
    private static double obtenerPrecioAlqDiarioAleatorio() {
    	return 10.0 + (100.0+10.0)* random.nextDouble();
    }
    
    public void mostrarTodos() {
    	for(Vehiculo v: Vehiculos) {
    		v.mostrarVehiculo();
    	}
    }
    
    public void filtrarPorConsumo(double consumo) {
    	for(Vehiculo v: Vehiculos) {
    		if(v.getConsumo()<=consumo) {
    			v.mostrarVehiculo();
    		}
    	}
    }
    
    public double precioMedioAlquiler() {
    	double media=0.0;
    	for(Vehiculo v: Vehiculos) {
    		media+=v.getPrecioAlqDiario();
    	}
    	return media/Vehiculos.size();
    }
    
}














