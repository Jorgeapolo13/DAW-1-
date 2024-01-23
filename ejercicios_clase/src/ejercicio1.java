import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1=input.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2=input.nextInt();
        if(num1==num2) {
        	System.out.println("Los numeros introducidos son iguales");
        }
        else {
        	System.out.println("Los numeros introducidos no son iguales");
        }
        input.close();
    }
}