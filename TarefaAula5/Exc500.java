package EstruturaDeDados;
import java.util.Scanner;

public class Exc500 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int[] numl = new int[5];
        int L, flag, flagl, op;

        flag = 0;
        flagl = 0;

        for (L = 0; L < 5; L++) {
            num[L] = 0;
            numl[L] = 0;
        }

        do {
            System.out.println("\n\n\n");
            System.out.println("VETORES");
            System.out.println("\nDados do VETOR A");
            System.out.println("Dados do VETOR B");
            System.out.println("\n3 Imprime VETORES");
            System.out.println("\n4 Soma VETORES");
            System.out.println("\n5 Subtrai VETORES");
            System.out.println("\n6 Sai do programa");
            System.out.print("\nOPCAO:");

            Scanner scanner = new Scanner(System.in);
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    entrada(num, 5, "A");
                    flag = 1;
                    break;
                case 2:
                    entrada(numl, 5, "B");
                    flagl = 1;
                    break;
                case 3:
                    if (flag != 0 && flagl != 0) {
                        imprime(num, 5, "A");
                        imprime(numl, 5, "B");
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 4:
                    if (flag != 0 && flagl != 0) {
                        soma(num, numl, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 5:
                    if (flag != 0 && flagl != 0) {
                        subtrai(num, numl, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 6:
                    System.out.println("Saindo do Algoritmo");
                    break;
                default:
                    System.out.println("\nopcao invalida");
            }
        } while (op != 6);
    }

    public static void entrada(int[] vet, int t, String c) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEntrada do VETOR " + c);

        for (int L = 0; L < t; L++) {
            System.out.print("Digite numero " + (L + 1) + ": ");
            vet[L] = scanner.nextInt();
        }
    }

    public static void imprime(int[] vet, int t, String c) {
        System.out.println("\nVETOR " + c);

        for (int L = 0; L < t; L++) {
            System.out.println((L + 1) + ": " + vet[L]);
        }
    }

    public static void soma(int[] vet, int[] vetl, int t) {
        System.out.println("\nSOMA");

        for (int L = 0; L < t; L++) {
            int s = vet[L] + vetl[L];
            System.out.println(s);
        }
    }

    public static void subtrai(int[] vet, int[] vetl, int t) {
        System.out.println("\nDIFERENCA");

        for (int L = 0; L < t; L++) {
            int d = vet[L] - vetl[L];
            System.out.println(d);
        }
    }
}