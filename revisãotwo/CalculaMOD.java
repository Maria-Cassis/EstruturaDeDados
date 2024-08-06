package revisãotwo ;

import java.util.Scanner;

public class CalculaMOD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero x: ");
        int x = scanner.nextInt();
        System.out.println("Digite o numero y: ");
        int y = scanner.nextInt();
        int resultado = calcularMOD(x, y);
        System.out.println("O resto da divisão de " + x + " por " + y + " é " + resultado);
    }

    public static int calcularMOD(int x, int y) {
        if (x == y) {
            return 0;
        } else if (x < y) {
            return x;
        } else {
            return calcularMOD(x - y, y);
        }
    }
}
