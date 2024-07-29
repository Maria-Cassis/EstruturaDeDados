package exerciciosderesivao;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ControlePistaDecolagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Aviao> filaDecolagem = new LinkedList<>();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Listar o número de aviões aguardando na fila de decolagem");
            System.out.println("2. Autorizar a decolagem do primeiro avião da fila");
            System.out.println("3. Adicionar um avião à fila de espera");
            System.out.println("4. Listar todos os aviões na fila de espera");
            System.out.println("5. Listar as características do primeiro avião da fila");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Número de aviões aguardando na fila de decolagem: " + filaDecolagem.size());
                    break;
                case 2:
                    if (!filaDecolagem.isEmpty()) {
                        Aviao aviaoDecolando = filaDecolagem.poll();
                        System.out.println("Avião autorizado para decolagem: " + aviaoDecolando);
                    } else {
                        System.out.println("Não há aviões na fila de decolagem.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do avião:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o identificador do avião:");
                    int identificador = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha

                    Aviao novoAviao = new Aviao(nome, identificador);
                    filaDecolagem.add(novoAviao);
                    System.out.println("Avião adicionado à fila de espera: " + novoAviao);
                    break;
                case 4:
                    if (!filaDecolagem.isEmpty()) {
                        System.out.println("Aviões na fila de espera:");
                        for (Aviao aviao : filaDecolagem) {
                            System.out.println(aviao);
                        }
                    } else {
                        System.out.println("Não há aviões na fila de espera.");
                    }
                    break;
                case 5:
                    if (!filaDecolagem.isEmpty()) {
                        Aviao primeiroAviao = filaDecolagem.peek();
                        System.out.println("Primeiro avião na fila: " + primeiroAviao);
                    } else {
                        System.out.println("Não há aviões na fila de espera.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
    }
}