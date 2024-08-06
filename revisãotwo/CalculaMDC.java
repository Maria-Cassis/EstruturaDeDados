package revisãotwo; 
import java.util.Scanner;

public class CalculaMDC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero x: ");
        int x = scanner.nextInt();
        System.out.println("Digite o numero y: ");
        int y = scanner.nextInt();
        int resultado = calcularMDC(x, y);
        System.out.println("O MDC de " + x + " e " + y + " é " + resultado);
    }

    public static int calcularMDC(int x, int y) {
        if (x == y) {
            return x;
        } else if (x > y) {
            return calcularMDC(x - y, y);
        } else {
            return calcularMDC(y, x);
        }
    }
}
