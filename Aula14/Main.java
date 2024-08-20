package Aula14;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static boolean verificaExpressao(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(' || caractere == '{' || caractere == '[') {
                pilha.push(caractere);
            }

            else if (caractere == ')' || caractere == '}' || caractere == ']') {
                if (pilha.isEmpty()) {
                    return false;
                }

                char ultimo = pilha.pop();
                if ((caractere == ')' && ultimo != '(') ||
                        (caractere == '}' && ultimo != '{') ||
                        (caractere == ']' && ultimo != '[')) {
                    return false;
                }
            }
        }

        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma expressão para verificar: ");
        String expressao = scanner.nextLine();

        if (verificaExpressao(expressao)) {
            System.out.println("A expressão está correta.");
        } else {
            System.out.println("A expressão está incorreta.");
        }

        scanner.close();
    }
}
