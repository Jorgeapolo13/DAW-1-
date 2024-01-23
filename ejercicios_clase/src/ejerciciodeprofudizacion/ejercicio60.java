package ejerciciodeprofudizacion;

class ejercicio60 {

	public static void main(String[] args) {
		ejercicio60 miObjeto=new ejercicio60();
		System.out.println("Numero de numeros primos entre el 1 y el 10.000");
		int contPrimo=0;
		for(int i=1;i<=10000;i++) {
			if( miObjeto.esPrimo(i)) {
				contPrimo++;
			}
		}
		System.out.println("El numero de primos que hay enter el 1 y el 10.000 es: "+contPrimo);
	}
	public boolean esPrimo(int num) {
		boolean esPrimo=true;
		if(num!=1) {
			if(num!=2) {
				for(int i=2;i<num;i++) {
					if(num%i==0) {
						esPrimo=false;
					}
				}
			}

		}else {
			esPrimo=false;
		}
	
		return esPrimo;
	}
}
