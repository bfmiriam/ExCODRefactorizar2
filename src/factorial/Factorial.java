package factorial;

/**
 * Clase que contiene la funcion main
 *
 * @author mbacelofernandez
 */
public class Factorial {

    /**
     * Este programa multiplica los números enteros positivos que hay entre un
     * número y el 1
     *
     * @param args argumentos de la clase principal
     */

    public static void main(String[] args) {

        int numero = 8;
        int factorial;

        Calculos calculoFactorial = new Calculos();
        factorial = calculoFactorial.calcularFactorial(numero);

        System.out.println(factorial);

    }

}
