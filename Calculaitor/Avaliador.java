import java.util.Stack;

public class Avaliador {
    public static int avaliarPosfixa(String expressao) {
        Stack<Integer> pilha = new Stack<>();

        for (char c : expressao.toCharArray()) {
            if (Character.isDigit(c)) {
                pilha.push(c - '0');
            } else {
                int op1 = pilha.pop();
                int op2 = pilha.pop();
                switch (c) {
                    case '+':
                        pilha.push(op2 + op1);
                        break;
                    case '-':
                        pilha.push(op2 - op1);
                        break;
                    case '*':
                        pilha.push(op2 * op1);
                        break;
                    case '/':
                        pilha.push(op2 / op1);
                        break;
                }
            }
        }

        return pilha.pop();
    }

    public static int avaliarPrefixa(String expressao) {
        Stack<Integer> pilha = new Stack<>();

        for (int i = expressao.length() - 1; i >= 0; i--) {
            char c = expressao.charAt(i);
            if (Character.isDigit(c)) {
                pilha.push(c - '0');
            } else {
                int op1 = pilha.pop();
                int op2 = pilha.pop();
                switch (c) {
                    case '+':
                        pilha.push(op1 + op2);
                        break;
                    case '-':
                        pilha.push(op1 - op2);
                        break;
                    case '*':
                        pilha.push(op1 * op2);
                        break;
                    case '/':
                        pilha.push(op1 / op2);
                        break;
                }
            }
        }

        return pilha.pop();
    }
}
