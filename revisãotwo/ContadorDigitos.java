package revisãotwo;
import java.util.Scanner;

public class ContadorDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero N: ");
        int N = scanner.nextInt();
        System.out.println("Digite o numero K: ");
        int K = scanner.nextInt();
        int ocorrencias = contarDigito(N, K);
        System.out.println("O dígito " + K + " ocorre " + ocorrencias + " vezes no número " + N);
    }

    public static int contarDigito(int N, int K) {
        if (N == 0) {
            return 0;
        } else {
            int ultimoDigito = N % 10;
            int resto = N / 10;
            if (ultimoDigito == K) {
                return 1 + contarDigito(resto, K);
            } else {
                return contarDigito(resto, K);
            }
        }
    }
}
