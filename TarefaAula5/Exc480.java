package EstruturaDeDados;

import java.util.Scanner;

public class Exc480 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, x;
        System.out.print("\ndigite um numero: ");
        n = scanner.nextInt();
        x = reverso(n);

        System.out.printf("\n%d - %d", n, x);
        if (x == n) {
            System.out.println("\nE um numero capicua");
        } else {
            System.out.println("\nNao e um numero capicua");
        }
        System.out.println();
    }

    public static int reverso(int num) {
        int soma = 0, r;
        while (num != 0) {
            r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }
        return soma;
    }
}
