package EstruturaDeDados;
import java.util.Scanner;

public class Exc470 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, pri;
        System.out.print("\ndigite um numero >0: ");
        num = scanner.nextInt();
        pri = primo(num);
    
        if (pri == 0) {
            System.out.printf("\ne primo %d", num);
        } else {
            System.out.printf("\nnao e primo %d", num);
        }
        System.out.println();
        }
    
        public static int primo(int n) {
            int c = 0;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    c = 1;
                    break;
                }
            }
        return c;
    }
}
