package Fernando;

import java.util.Scanner;

public class exercicio348 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAlunos = 5;

        String[] nomes = new String[numAlunos];
        double[] notas1 = new double[numAlunos];
        double[] notas2 = new double[numAlunos];
        double[] medias = new double[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.next();

            while (true) {
                try {
                    System.out.println("Digite a nota 1 do aluno " + (i + 1) + ": ");
                    notas1[i] = scanner.nextDouble();

                    System.out.println("Digite a nota 2 do aluno " + (i + 1) + ": ");
                    notas2[i] = scanner.nextDouble();

                    break;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Por favor, digite um número válido.");
                    scanner.next();
                }
            }

            medias[i] = (notas1[i] + notas2[i]) / 2;
        }

        System.out.println("\nListagem de Alunos:");
        System.out.printf("%-15s%-10s%-10s%-10s\n", "Nome", "Nota 1", "Nota 2", "Média");
        for (int i = 0; i < numAlunos; i++) {
            System.out.printf("%-15s%-10.2f%-10.2f%-10.2f\n", nomes[i], notas1[i], notas2[i], medias[i]);
        }

        scanner.close();
    }
}