package dosmaximos;

/**
 *
 * @author alexj
 */
public class DosMaximos {

    static int[] numeros = {1, 6, 55, 99, 88, 109, 40};
    static int[] max = {0, 0};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        maximos(numeros, max);
        imprimir(max);
    }

    public static void maximos(int[] numeros, int[] max) {
        if (numeros.length != 0) {
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > max[0]) {
                    max[1] = max[0];
                    max[0] = numeros[i];
                }else if (numeros[i] > max[1]) {
                    max[1] = numeros[i];
                }
            }
        }
    }

    public static void imprimir(int[] max) {
        System.out.println("Los dos mayores son: ");
        for (int i = 0; i < max.length; i++) {
            System.out.print(max[i] + "  ");
        }
    }
}
