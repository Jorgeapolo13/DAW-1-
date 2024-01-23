package arrays;

public class ejercicio11 {
    public static void main(String[] args) {
        String[] cadenas = {"asimilar", "dromedario", "calvinista", "lagartija", "tiovivo", "salamandra"};
        String cadenaConMasVocales = encontrarCadenaConMasVocales(cadenas);
        System.out.println("La cadena con más vocales es: " + cadenaConMasVocales);
    }

    public static int contarVocales(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = Character.toLowerCase(cadena.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static String encontrarCadenaConMasVocales(String[] cadenas) {
        String cadenaConMasVocales = "";
        int maxVocales = 0;

        for (String cadena : cadenas) {
            int numVocales = contarVocales(cadena);
            if (numVocales > maxVocales) {
                maxVocales = numVocales;
                cadenaConMasVocales = cadena;
            }
        }

        return cadenaConMasVocales;
    }
}

