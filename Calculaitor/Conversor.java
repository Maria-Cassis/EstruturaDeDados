import java.util.Stack;

public class Conversor {

    public static String infixaParaPosfixa(String expressao) {
        StringBuilder saida = new StringBuilder();
        Stack<Character> pilha = new Stack<>();
        int prioridade;

        for (char c : expressao.toCharArray()) {
            prioridade = getPrioridade(c);
            if (Character.isDigit(c)) {
                saida.append(c);
            } else if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                while (!pilha.isEmpty() && pilha.peek() != '(') {
                    saida.append(pilha.pop());
                }
                pilha.pop();
            } else {
                while (!pilha.isEmpty() && getPrioridade(pilha.peek()) >= prioridade) {
                    saida.append(pilha.pop());
                }
                pilha.push(c);
            }
        }

        while (!pilha.isEmpty()) {
            saida.append(pilha.pop());
        }

        return saida.toString();
    }

    private static int getPrioridade(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    public static String infixaParaPrefixa(String expressao) {
        String invertida = new StringBuilder(expressao).reverse().toString();
        invertida = invertida.replace('(', 't').replace(')', '(').replace('t', ')');
        String posfixa = infixaParaPosfixa(invertida);
        return new StringBuilder(posfixa).reverse().toString();
    }

    public static String posfixaParaInfixa(String expressao) {
        Stack<String> pilha = new Stack<>();

        for (char c : expressao.toCharArray()) {
            if (Character.isDigit(c)) {
                pilha.push(String.valueOf(c));
            } else {
                String op1 = pilha.pop();
                String op2 = pilha.pop();
                pilha.push("(" + op2 + c + op1 + ")");
            }
        }

        return pilha.peek();
    }

    public static String posfixaParaPrefixa(String expressao) {
        Stack<String> pilha = new Stack<>();

        for (char c : expressao.toCharArray()) {
            if (Character.isDigit(c)) {
                pilha.push(String.valueOf(c));
            } else {
                String op1 = pilha.pop();
                String op2 = pilha.pop();
                pilha.push(c + op2 + op1);
            }
        }

        return pilha.peek();
    }

    public static String prefixaParaInfixa(String expressao) {
        Stack<String> pilha = new Stack<>();

        for (int i = expressao.length() - 1; i >= 0; i--) {
            char c = expressao.charAt(i);
            if (Character.isDigit(c)) {
                pilha.push(String.valueOf(c));
            } else {
                String op1 = pilha.pop();
                String op2 = pilha.pop();
                pilha.push("(" + op1 + c + op2 + ")");
            }
        }

        return pilha.peek();
    }

    public static String prefixaParaPosfixa(String expressao) {
        Stack<String> pilha = new Stack<>();

        for (int i = expressao.length() - 1; i >= 0; i--) {
            char c = expressao.charAt(i);
            if (Character.isDigit(c)) {
                pilha.push(String.valueOf(c));
            } else {
                String op1 = pilha.pop();
                String op2 = pilha.pop();
                pilha.push(op1 + op2 + c);
            }
        }

        return pilha.peek();
    }
}
