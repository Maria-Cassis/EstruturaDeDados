package exerciciosderesivao;

import java.util.Scanner;
import java.util.Stack;

public class RemovedorDeItemDaPilha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();

        // Preenchendo a pilha com alguns valores de exemplo
        System.out.println("Digite os elementos da pilha (digite 'fim' para parar):");
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }
            try {
                pilha.push(Integer.parseInt(entrada));
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            }
        }

        System.out.println("Digite o valor da chave que deseja remover:");
        int chave = scanner.nextInt();

        // Remover o item com a chave especificada
        removerItemDaPilha(pilha, chave);

        // Imprimir a pilha após a remoção
        System.out.println("Pilha após a remoção do item:");
        System.out.println(pilha);

        scanner.close();
    }

    public static void removerItemDaPilha(Stack<Integer> pilha, int chave) {
        Stack<Integer> pilhaTemporaria = new Stack<>();

        // Desempilhar elementos da pilha original e empilhá-los na pilha temporária
        while (!pilha.isEmpty()) {
            int item = pilha.pop();
            if (item == chave) {
                break; // Descartar o item com a chave especificada
            }
            pilhaTemporaria.push(item);
        }

        // Empilhar novamente os elementos da pilha temporária na pilha original
        while (!pilhaTemporaria.isEmpty()) {
            pilha.push(pilhaTemporaria.pop());
        }
    }
}
