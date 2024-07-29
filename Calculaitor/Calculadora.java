import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a expressão: ");
        String expressao = scanner.nextLine();
        System.out.println("Digite a notação (infixa, posfixa, prefixa): ");
        String notacao = scanner.nextLine().toLowerCase();

        String infixa = "", posfixa = "", prefixa = "";
        int resultado = 0;

        switch (notacao) {
            case "infixa":
                infixa = expressao;
                posfixa = Conversor.infixaParaPosfixa(expressao);
                prefixa = Conversor.infixaParaPrefixa(expressao);
                resultado = Avaliador.avaliarPosfixa(posfixa);
                break;
            case "posfixa":
                posfixa = expressao;
                infixa = Conversor.posfixaParaInfixa(expressao);
                prefixa = Conversor.posfixaParaPrefixa(expressao);
                resultado = Avaliador.avaliarPosfixa(expressao);
                break;
            case "prefixa":
                prefixa = expressao;
                infixa = Conversor.prefixaParaInfixa(expressao);
                posfixa = Conversor.prefixaParaPosfixa(expressao);
                resultado = Avaliador.avaliarPrefixa(expressao);
                break;
            default:
                System.out.println("Notação inválida!");
                scanner.close();
                return;
        }

        System.out.println("Resultado: " + resultado);
        System.out.println("Infixa: " + infixa);
        System.out.println("Pós-fixa: " + posfixa);
        System.out.println("Pré-fixa: " + prefixa);

        scanner.close();
    }
}
