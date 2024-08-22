import java.util.Random;
import java.util.Stack;

public class Atividade3 {
    public static void main(String[] args) {
        Random random = new Random();
        Stack<Integer> pilha1 = new Stack<>();
        Stack<Integer> pilha2 = new Stack<>();
        Stack<Integer> pilha3 = new Stack<>();

        for (int i = 0; i < 100; i++) {
            int numero = random.nextInt(9) + 1;
            if (numero >= 1 && numero <= 3) {
                pilha1.push(numero);
            } else if (numero >= 4 && numero <= 6) {
                pilha2.push(numero);
            } else {
                pilha3.push(numero);
            }
        }

        for (int i = 0; i < 100; i++) {
            int escolha = random.nextInt(3) + 1;
            if (pilha1.isEmpty() || pilha2.isEmpty() || pilha3.isEmpty()) {
                break;
            }

            if (escolha == 1) {
                if (!pilha2.isEmpty()) pilha1.push(pilha2.pop());
                if (!pilha3.isEmpty()) pilha1.push(pilha3.pop());
            } else if (escolha == 2) {
                if (!pilha1.isEmpty()) pilha2.push(pilha1.pop());
                if (!pilha3.isEmpty()) pilha2.push(pilha3.pop());
            } else {
                if (!pilha1.isEmpty()) pilha3.push(pilha1.pop());
                if (!pilha2.isEmpty()) pilha3.push(pilha2.pop());
            }
        }

        System.out.println("Pilha 1: " + pilha1);
        System.out.println("Pilha 2: " + pilha2);
        System.out.println("Pilha 3: " + pilha3);

        if (pilha1.isEmpty()) {
            System.out.println("O programa foi encerrado porque a pilha 1 está vazia.");
        } else if (pilha2.isEmpty()) {
            System.out.println("O programa foi encerrado porque a pilha 2 está vazia.");
        } else if (pilha3.isEmpty()) {
            System.out.println("O programa foi encerrado porque a pilha 3 está vazia.");
        } else {
            System.out.println("O programa foi encerrado porque os 100 números sorteados foram atingidos.");
        }
    }
}
