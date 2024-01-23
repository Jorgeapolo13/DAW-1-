package clase4deoctubre;
import java.util.Scanner;


public class ejercicio1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que clase energetica es tu frigorifico?");
        String clase=scanner.next();
        String mensaje="";
        switch(clase) {
          	case "A++":
        	  mensaje="Excelente";
        	  break;
          	case "A+":
        	  mensaje="Sobresaliente";
        	  break;
          	case "A":
        	  mensaje="Notable";
        	  break;
          	case "B":
        	  mensaje="Bien";
        	  break;
          	case "C":
          	  mensaje="Suficiente";
          	  break;
          	case "D":
          	  mensaje="Insuficiente";
          	  break;
        }
        System.out.println("La clasificacion energetica de tu frigorifico es: "+mensaje);        

        scanner.close();
    }
}