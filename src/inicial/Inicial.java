package inicial;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Arreglos.
 * Lee NUM enteros en un arreglo, multiplica los elementos del arreglo
 * y visualiza el producto.
 */

public class Inicial {

    public static void main(String[] a) {
        final int NUM = 10;
        Scanner entrada = new Scanner(System.in);
        int[] nums = new int[NUM];
        int total = 1;
        System.out.println("Por favor, introduzca " + NUM + " datos");
        for (int i = 0; i < NUM; i++) {
            nums[i] = entrada.nextInt();
        }
        System.out.print("\nLista de números: ");
        for (int i = 0; i < NUM; i++) {
            System.out.print(" " + nums[i]);
            total *= nums[i];
        }
        System.out.println("\nEl producto de los números es " + total);
    }
}
