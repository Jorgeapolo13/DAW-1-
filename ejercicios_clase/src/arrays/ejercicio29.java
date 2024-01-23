package arrays;

public class ejercicio29 {

    public static void main(String[] args) {
        int[] array = {5, 2, 5, 1, 5, 6};

        System.out.println("Array original:");
        imprimirArray(array);

        ordenarArray(array);

        System.out.println("\nArray ordenado de menor a mayor:");
        imprimirArray(array);
    }
    public static void imprimirArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void ordenarArray(int[] arr) {
        int n = arr.length;
        boolean intercambio;

        do {
            intercambio = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
              
                }
            }
        } while (intercambio);
    }
}

