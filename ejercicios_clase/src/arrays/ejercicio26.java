package arrays;

public class ejercicio26 {
    public static void main(String[] args) {
        String[] dnis = {"80137039T", "30198235S", "15835050X", "30533829H",
                "46548712R", "30499569M", "30437328W", "30519074Y"};

        for (String dni : dnis) {
            if (validarDNI(dni)) {
                System.out.println(dni + " es correcto.");
            } else {
                System.out.println(dni + " es incorrecto.");
            }
        }
    }

    private static boolean validarDNI(String dni) {
        if (dni.length() != 9) {
            return false;
        }

        char letraDNI = dni.charAt(8);
        String numerosDNI = dni.substring(0, 8);

        try {
            int numDNI = Integer.parseInt(numerosDNI);
            char letraCalculada = calcularLetraDNI(numDNI);

            return letraDNI == letraCalculada;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static char calcularLetraDNI(int numDNI) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numDNI % 23;
        return letras.charAt(resto);
    }
}

