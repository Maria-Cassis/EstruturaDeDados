package Atividade.sobrePilhas;

import java.util.Stack;

public class PilhaInvertePalavras {
    
    public static String inverterPalavras(String input) {
        String[] palavras = input.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<>();
            for (char letra : palavra.toCharArray()) {
                pilha.push(letra);
            }
            StringBuilder palavraInvertida = new StringBuilder();
            while (!pilha.isEmpty()) {
                palavraInvertida.append(pilha.pop());
            }
            resultado.append(palavraInvertida).append(" ");
        }

        return resultado.toString().trim();
    }

    public static void main(String[] args) {
        String exemplo1 = "UM CIENTISTA DA COMPUTAÇAO OU UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String exemplo2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E AIGOLONCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OAS SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";

        System.out.println("Exemplo 1:");
        System.out.println(inverterPalavras(exemplo1));

        System.out.println("\nExemplo 2:");
        System.out.println(inverterPalavras(exemplo2));
    }
}