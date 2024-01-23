import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el cociente");
        int num1=input.nextInt();
        System.out.println("Introduce el divisor");
        int num2=input.nextInt();
        if(num1>num2) {
            if(num1%num2==0) {
            	System.out.println(num1+" es multiplo de "+num2);
            }
            else {
            	System.out.println(num1+" no es multiplo de "+num2);
            }
        }
        else{
        	if(num2%num1==0) {
               	System.out.println(num2+" es multiplo de "+num1);
            }
            else {
            	System.out.println(num2+" no es multiplo de "+num1);
            }
        }

        input.close();
    }
}