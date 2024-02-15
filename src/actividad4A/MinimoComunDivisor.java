package actividad4A;

/**
 *
 * @author Bustos Vega Edgar Daniel 
 */
public class MinimoComunDivisor {

     static public int divisor(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        } else if (a >= b) {
            return divisor((a - b), b);
        } else {
            return divisor(a, (b - a));
        }
    }

    public static void main(String[] args) {
        int a = 18, b = 21;
        
        System.out.println("El minimo comun divisor es: " + divisor(a, b));
    }

}
