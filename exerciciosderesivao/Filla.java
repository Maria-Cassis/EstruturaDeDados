package exerciciosderesivao;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Random;

public class Filla {

    private static final int TAMANHO_FILA = 20;

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        preencherFila(fila);
        
        System.out.println("Fila original:");
        imprimirFila(fila);
        
        inverterFila(fila);
        
        System.out.println("Fila invertida:");
        imprimirFila(fila);
    }

    /**
     * Preenche a fila com 20 números inteiros aleatórios.
     * 
     * @param fila A fila a ser preenchida
     */
    private static void preencherFila(Queue<Integer> fila) {
        Random random = new Random();
        for (int i = 0; i < TAMANHO_FILA; i++) {
            fila.add(random.nextInt(100)); // Números aleatórios entre 0 e 99
        }
    }

    /**
     * Inverte a ordem dos elementos da fila usando uma pilha.
     * 
     * @param fila A fila a ser invertida
     */
    private static void inverterFila(Queue<Integer> fila) {
        Stack<Integer> pilha = new Stack<>();

        // Empilhar todos os elementos da fila
        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }

        // Desempilhar os elementos da pilha e adicionar de volta na fila
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
    }

    /**
     * Imprime os elementos da fila.
     * 
     * @param fila A fila a ser impressa
     */
    private static void imprimirFila(Queue<Integer> fila) {
        for (Integer numero : fila) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
