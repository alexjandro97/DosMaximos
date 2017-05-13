package dosmaximos;

/**
 *
 * @author alexj
 */
public class DosMaximos {

    //array que escaneamos (numeros) y el array auxiliar en el que guardamos los valores
    static int[] numeros = {1, 6, 55, 99, 88, 109, 40};
    static int[] max = {0, 0};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        maximos(numeros, max);
        imprimir(max);
    }

    /*
    Metodo en el que escaneamos  el array y sacamos los dos numeros mayores
    siempre que el array original (numeros) mida mas que cero, es decir,
    que no este vacio.
     */
    public static void maximos(int[] numeros, int[] max) {
        if (numeros.length != 0) {
            //escaneamos el array numeros
            for (int i = 0; i < numeros.length; i++) {
                /*
                si la posicion que escaneamos es mayor a la primera de max
                sustituimos la primera pos de max por la segunda y la pos 0
                de max, la sustituimos por la pos i de numeros
                 */
                if (numeros[i] > max[0]) {
                    max[1] = max[0];
                    max[0] = numeros[i];
                    /*
                    Si no es mayor que el primer valor, escaneamos si lo es 
                    del segundo y sustituimos.
                     */
                } else if (numeros[i] > max[1]) {
                    max[1] = numeros[i];
                }
            }
        }
    }

    //metodo para imprimir el segundo array en el que sacamos el resultado
    public static void imprimir(int[] max) {
        System.out.println("Los dos mayores son: ");
        for (int i = 0; i < max.length; i++) {
            System.out.print(max[i] + "  ");
        }
    }
}
