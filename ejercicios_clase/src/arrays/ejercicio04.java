package arrays;

class ejercicio04 {

	public static void main(String[] args) {
		int [] miArray= new int [10];
		int num=50;
		for(int i=0;i<miArray.length;i++) {
			miArray[i]=num;
			num+=5;
		}
		for(int i=0;i<miArray.length;i++) {
			System.out.println(miArray[i]);
		}
	}

}
