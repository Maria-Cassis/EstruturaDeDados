package exerciciosderesivao;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class FilaPilha {

    @SuppressWarnings("unused")
    private static final int TOTAL_NUMEROS = 2000;
    private static final int NUMEROS_POSITIVOS = 1000;
    private static final int NUMEROS_NEGATIVOS = 1000;
    private static final int LIMITE_NUMERO = 1000;

    public static void main(String[] args) {
        // Criação da fila e pilha
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        // Preencher a fila com números aleatórios
        preencherFila(fila);

        // Processar a fila conforme a lógica descrita
        processarFila(fila, pilha);

        // Imprimir o estado final da pilha
        imprimirPilha(pilha);
    }

    /**
     * Preenche a fila com números positivos e negativos aleatórios.
     *
     * @param fila A fila a ser preenchida
     */
    private static void preencherFila(Queue<Integer> fila) {
        Random random = new Random();
        for (int i = 0; i < NUMEROS_POSITIVOS; i++) {
            fila.add(random.nextInt(LIMITE_NUMERO) + 1); // Números positivos entre 1 e 1000
        }
        for (int i = 0; i < NUMEROS_NEGATIVOS; i++) {
            fila.add(-(random.nextInt(LIMITE_NUMERO) + 1)); // Números negativos entre -1 e -1000
        }
    }

    /**
     * Processa a fila e manipula a pilha conforme o tipo de número.
     *
     * @param fila A fila a ser processada
     * @param pilha A pilha onde os números positivos são empilhados
     */
    private static void processarFila(Queue<Integer> fila, Stack<Integer> pilha) {
        while (!fila.isEmpty()) {
            int numero = fila.poll(); // Remove o número do início da fila
            
            if (numero > 0) {
                // Número positivo, empilhar na pilha
                pilha.push(numero);
            } else {
                // Número negativo, desempilhar da pilha e imprimir
                if (!pilha.isEmpty()) {
                    System.out.println("Número retirado da pilha: " + pilha.pop());
                } else {
                    System.out.println("Pilha está vazia, não há números para retirar.");
                }
            }
        }
    }

    /**
     * Imprime todos os números restantes na pilha.
     *
     * @param pilha A pilha a ser impressa
     */
    private static void imprimirPilha(Stack<Integer> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("Pilha está vazia.");
        } else {
            System.out.println("Pilha final:");
            while (!pilha.isEmpty()) {
                System.out.println(pilha.pop());
            }
        }
    }
}
