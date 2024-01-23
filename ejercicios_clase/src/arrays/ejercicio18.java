package arrays;

class ejercicio18 {

	public static void main(String[] args) {
		String [] contraseñas = {"ABC123434", "asdfasdf$$@",
				"###34234234", "12341234ABC", "asdfasdfB333"}; 
		boolean correcta;
		int contNum;

		for(int i=0;i<contraseñas.length;i++) {
			contNum=0;
			correcta=true;

			if(contraseñas[i].length()<10) {
				correcta=false;
			}

			if(correcta) {
				for(int j=0;j<contraseñas[i].length();j++) {

					if( !Character.isLetterOrDigit(contraseñas[i].charAt(j) ) ) {
						correcta=false;
						break;
					}

					if( Character.isDigit(contraseñas[i].charAt(j) ) ) {
						contNum++;
					}

				}

				if(contNum<2) {
					correcta=false;
				}

			}
			if(correcta) {
				System.out.println("La contraseña: "+contraseñas[i] +" es valida!");
			}else {
				System.out.println("La contraseña: "+contraseñas[i] +" es invalida");
			}
		}
	}

}
