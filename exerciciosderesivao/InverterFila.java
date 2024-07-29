package exerciciosderesivao;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Random;

public class InverterFila {

    public static void main(String[] args) {
        Queue<Integer> filaF1 = new LinkedList<>();
        Queue<Integer> filaF2;

        // Preencher a fila F1 com 100 números aleatórios
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            filaF1.add(random.nextInt(1000)); // Adiciona números aleatórios de 0 a 999
        }

        // Inverter a fila F1 e criar a fila F2
        filaF2 = inverterFila(filaF1);

        // Exibir as filas para verificação
        System.out.println("Fila F1 (original): " + filaF1);
        System.out.println("Fila F2 (invertida): " + filaF2);
    }

    public static Queue<Integer> inverterFila(Queue<Integer> filaF1) {
        Stack<Integer> pilha = new Stack<>();
        Queue<Integer> filaF2 = new LinkedList<>();

        // Empilhar todos os elementos da fila F1
        while (!filaF1.isEmpty()) {
            pilha.push(filaF1.poll());
        }

        // Desempilhar todos os elementos para a nova fila F2
        while (!pilha.isEmpty()) {
            filaF2.add(pilha.pop());
        }

        return filaF2;
    }
}
