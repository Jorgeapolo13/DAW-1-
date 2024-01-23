package ejercicio10;

import java.time.LocalDateTime;

class Vehiculo {
	static LocalDateTime entrada;
	static String matricula;
	
	public Vehiculo (LocalDateTime entrada, String matricula) {
		this.entrada=entrada;
		this.matricula=matricula;
	}

	public LocalDateTime getEntrada() {
		return entrada;
	}

	public void setEntrada(LocalDateTime entrada) {
		Vehiculo.entrada = entrada;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		Vehiculo.matricula = matricula;
	}
	
}
