import java.util.Scanner;

public class exercicio346 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int escolha = 4;


        do {
            System.out.println("MENU");
            System.out.println("l - Imprime o comprimento da frase ");
            System.out.println("2 - Imprime os dois primeiros e os dois ultimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.println("OPCAO");

            int opcao = scan.nextInt();

            // Comprimento
            if (opcao == 1) {
                System.out.print("Digite uma frase: ");
                String frase = scan.next();
                int comprimento = frase.length();
        
                System.out.println("Número de Carcteres da frase: " + comprimento);

            }

            // Dois Primeiros e Dois Últimos Caracteres
            if (opcao == 2) {
                System.out.print("Digite uma frase: ");
                String frase = scan.next();
                String resultado = "";

                if (frase.length() >= 4) {
                    resultado = frase.substring(0, 2) + frase.substring(frase.length() - 2);
                } else {
                    resultado = frase;
                }

                System.out.println("Dois primeiros e dois últimos caracteres: " + resultado);
            }

            // Imprimir a frase espelhada
            if (opcao == 3) {
                System.out.print("Digite uma frase: ");
                String frase = scan.next();
                StringBuilder fraseEspelhada = new StringBuilder(frase).reverse();
        
                System.out.println(fraseEspelhada);
            }

            // Terminar
            if (opcao == 4) {
                System.out.println("Fim do algoritmo");
                break;
            }

        } while(escolha == 4);

        scan.close();
    }

}
