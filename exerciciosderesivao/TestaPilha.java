package exerciciosderesivao;

import java.util.Random;
import java.util.Stack;

public class TestaPilha {

    public static void main(String[] args) {
        Stack<Integer> pilhaP = new Stack<>(); // Pilha para números positivos
        Stack<Integer> pilhaN = new Stack<>(); // Pilha para números negativos
        Random random = new Random();

        // Sorteia 1000 números entre -100 e 100
        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(201) - 100; // Gera números entre -100 e 100

            if (numero > 0) {
                pilhaP.push(numero);
            } else if (numero < 0) {
                pilhaN.push(numero);
            } else {
                // Se o número for zero, remover um elemento de cada pilha e imprimir
                Integer numP = pilhaP.isEmpty() ? null : pilhaP.pop();
                Integer numN = pilhaN.isEmpty() ? null : pilhaN.pop();

                System.out.println("Número zero encontrado.");
                if (numP != null) {
                    System.out.println("Número retirado da pilha P: " + numP);
                } else {
                    System.out.println("Pilha P está vazia.");
                }
                if (numN != null) {
                    System.out.println("Número retirado da pilha N: " + numN);
                } else {
                    System.out.println("Pilha N está vazia.");
                }
            }
        }
    }
}
