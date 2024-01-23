package ejerciciodeprofudizacion;

import java.util.Scanner;

public class ejercicio51 {
    public static void main(String[] args) {
    		Scanner input = new Scanner(System.in);
    		
    		System.out.println("Cuantas pisos tendra la piramide?");
    		int filas=input.nextInt();
    		
    		int espacios,asteriscos=2;
    		
    		for(int i=0;i<filas;i++) {
    			
    			espacios= (int) ( ( Math.pow(2,filas)/2) - (asteriscos/2) );
    			
    			for(int j=0;j<espacios;j++) {
    				System.out.print(" ");
    			}
    			
    			for(int u=0;u<asteriscos;u++) {
    				System.out.print("*");
    			}
    			
    			System.out.println();
    			
    			asteriscos*=2;
    		}
    		
    		input.close();
        }
}

