package ejercicio11;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private int potencia;
	private double consumo;
	private double precioAlqDiario;
	
	public Vehiculo(String matricula, String marca, String modelo, int potencia, double consumo,
			double precioAlqDiario) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.consumo = consumo;
		this.precioAlqDiario = precioAlqDiario;
	}

	public Vehiculo(String matricula, double precioAlqDiario) {
		super();
		this.matricula = matricula;
		this.precioAlqDiario = precioAlqDiario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public double getPrecioAlqDiario() {
		return precioAlqDiario;
	}

	public void setPrecioAlqDiario(double precioAlqDiario) {
		this.precioAlqDiario = precioAlqDiario;
	}
	
	public void mostrarVehiculo() {
		System.out.printf("Datos del vehiculo:%nMatricula: %s %nMarca: %s %nModelo: %s %nPotencia: %d %nConsumo: %.2f %nPrecio del alquiler diario:%.2f%n",this.matricula,this.marca,this.modelo,this.potencia,this.consumo,this.precioAlqDiario);
	}
	
}
