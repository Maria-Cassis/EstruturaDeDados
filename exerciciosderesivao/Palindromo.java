package exerciciosderesivao;

import java.util.Scanner;
import java.util.Stack;

public class Palindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> pilha = new Stack<>();

        System.out.println("Digite uma sequência de caracteres:");
        String entrada = scanner.nextLine();

        // Remove espaços e pontos e converte para minúsculas para verificação de palíndromo
        String entradaSanitizada = entrada.replaceAll("[ .]", "").toLowerCase();

        // Preencher a pilha com caracteres da string de entrada
        for (char ch : entradaSanitizada.toCharArray()) {
            pilha.push(ch);
        }

        // Construir a string invertida usando a pilha
        StringBuilder invertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            invertida.append(pilha.pop());
        }

        // Imprimir o texto na ordem inversa
        System.out.println("Texto na ordem inversa:");
        System.out.println(invertida);

        // Verificar se o texto é um palíndromo
        if (entradaSanitizada.equals(invertida.toString())) {
            System.out.println("O texto é um palíndromo.");
        } else {
            System.out.println("O texto não é um palíndromo.");
        }

        scanner.close();
    }
}