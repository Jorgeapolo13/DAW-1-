package ejerciciodeprofudizacion;
class ejercicio24 {

	public static void main(String[] args) {
		for(int i=1000;i>=0;i-=100) {
			if(i!=500) {
				System.out.println(i);
			}else {
				System.out.println("**"+i+"**");
			}
		}
	}

}
