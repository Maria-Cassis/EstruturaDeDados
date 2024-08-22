import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilhaPar = new Stack<>();
        Stack<Integer> pilhaImpar = new Stack<>();
        int numero;

        do {
            System.out.print("Digite um número (-127 a 128, 0 para terminar): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    pilhaPar.push(numero);
                } else {
                    pilhaImpar.push(numero);
                }
            }
        } while (numero != 0);

        System.out.println("Removendo elementos alternadamente das pilhas:");
        while (!pilhaPar.isEmpty() && !pilhaImpar.isEmpty()) {
            if (!pilhaImpar.isEmpty()) {
                System.out.println("Removido da pilha ímpar: " + pilhaImpar.pop());
            }
            if (!pilhaPar.isEmpty()) {
                System.out.println("Removido da pilha par: " + pilhaPar.pop());
            }
        }

        if (!pilhaPar.isEmpty()) {
            System.out.println("Pilha par ainda possui elementos:");
            while (!pilhaPar.isEmpty()) {
                System.out.println(pilhaPar.pop());
            }
        } else if (!pilhaImpar.isEmpty()) {
            System.out.println("Pilha ímpar ainda possui elementos:");
            while (!pilhaImpar.isEmpty()) {
                System.out.println(pilhaImpar.pop());
            }
        } else {
            System.out.println("Nenhuma pilha possui elementos restantes.");
        }
    }
}
