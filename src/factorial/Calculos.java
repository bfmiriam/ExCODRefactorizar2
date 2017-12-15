package factorial;

/**
 * Esta clase contiene los cálculos del programa
 *
 * @author mbacelofernandez
 */
public class Calculos {

    /**
     * calcula el factorial del numero que se pasa por parámetro y devuelve el
     * factorial.
     *
     * @param numero numero del que se calculará el factorial
     * @return factorial del número introducido
     */

    public int calcularFactorial(int numero) {
        int factorial, i;
        if (numero == 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (i = numero; i >= 1; i--) {
                factorial = factorial * i;
            }
        }
        return factorial;

    }
}
