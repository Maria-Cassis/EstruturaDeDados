package Fernando;

import java.util.Scanner;

public class exercicio358 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPessoas = 20;

        String[] nomes = new String[numPessoas];
        int[] idades = new int[numPessoas];

        String[] nomesFiltrados = new String[numPessoas];
        int contadorNomesFiltrados = 0;

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            scanner.nextLine();

            char primeiraLetra = Character.toUpperCase(nomes[i].charAt(0));
            if (primeiraLetra >= 'L' && primeiraLetra <= 'S') {
                nomesFiltrados[contadorNomesFiltrados] = nomes[i];
                contadorNomesFiltrados++;
            }
        }

        System.out.println("\nNomes no intervalo L - S:");
        for (int i = 0; i < contadorNomesFiltrados; i++) {
            System.out.println(nomesFiltrados[i]);
        }

        scanner.close();
    }
}
