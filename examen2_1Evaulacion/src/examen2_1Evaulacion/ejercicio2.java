package examen2_1Evaulacion;

class ejercicio2 {
	static String[] meses= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",
			"Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	static int[][]ventas = {{10,	25,	67,	89,	32,	87,	54,	86,	92,	62,	74,	57},
			{16,	15,	19,	43,	18,	89,	58,	17,	87,	33,	85,	49},
			{27,	38,	20,	65,	45,	97,	16,	68,	90,	48,	96,	39},
			{36,	42,	74,	30,	72,	69,	37,	40,	43,	74,	43,	51},
			{84,	58,	61,	84,	40,	50,	25,	83,	31,	62,	38,	23}};
	static String []empleados= {"Antonio","Angela","Marta","Jorge","Alejandro"};
	public static void main(String[] args) {
		empleadoAño();
		mesVentas();
		mejorVentaDelAño();
		mejorVendedorMes();
	}
	public static void mesVentas() {
		int max=sumarVentasMes(0);
		String mes=meses[0];
		for(int i=0;i<12;i++) {
			if(sumarVentasMes(i)>max) {
				max=sumarVentasMes(i);
				mes=meses[i];
			}
		}
		System.out.println("EL mes con mas ventas de este año ha sido "+mes);
	}
	public static void empleadoAño() {
		int max=sumarVentasAño(0);
		String empleadodelAño = empleados[0];
		for(int i=0;i<5;i++) {
			if(sumarVentasAño(i)>max) {
				max=sumarVentasAño(i);
				empleadodelAño=empleados[i];
			}
		}
		System.out.println("El empleado con mas ventas de este año es "+empleadodelAño);
	}
	public static int sumarVentasAño(int fila) {
		int suma=0;
		for(int i=0;i<ventas[0].length;i++) {
			suma+=ventas[fila][i];
		}
		return suma;
	}
	public static int sumarVentasMes(int columna) {
		int suma=0;
		for(int i=0;i<ventas.length;i++) {
			suma+=ventas[i][columna];
		}
		return suma;
	}
	public static void mejorVentaDelAño() {
		int empleado=0,max=ventas[0][0],mes=0;
		for(int i=0;i<ventas.length;i++) {
			for(int j=0;j<ventas[i].length;j++) {
				if(ventas[i][j]>max) {
					empleado=i;
					mes=j;
					max=ventas[i][j];
				}
			}
		}
		System.out.println("El empleado con la mayor venta es "+empleados[empleado]+" en el mes "+meses[mes]+". La venta fue por un total de "+max);
	}
	public static void mejorVendedorMes() {
		int empleado,max;
		for(int j=0;j<ventas[0].length;j++) {
			empleado=0;
			max=ventas[0][j];
			for(int i=0;i<ventas.length;i++) {
				if(ventas[i][j]>max) {
					empleado=i;
					max=ventas[i][j];
				}
			}
			System.out.println("El empleado que mas ha vendido en "+meses[j]+" es "+empleados[empleado]);
		}
	}
}
