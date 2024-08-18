//Atividade

//Utilizando uma Lista Circular  Duplamente Encadeada com Sentinela, criar uma aplicação para gerar 1000 números aleatórios de -9999 a 9999 e armazená-los  num vetor de 1000 posições. Faça a impressão desses números na sua ordem de geração. Crie uma lista duplamente encadeada e vá inserindo os números presentes no vetor na lista encadeada. Porém cada número deverá ser colocado na sua posição correta na lista duplamente encadeada, ou seja,  serão inseridos em ordem crescente na lista. Imprima lista em ordem crescente e depois em ordem decrescente. O vetor deve ser percorrido (o vetor não deve ser ordenado), e o número será inserido na posição correta na lista

//Exemplo:

//Vetor => [4, -5 , 8, 17, -3, 0, -5, 9, 11]

//Lista => 4

//Lista => -5, 4

//Lista => -5, 4, 8

//Lista => -5, 4, 8, 17

//Lista => -5, -3, 4, 8, 17

//Lista => -5, -3, 0, 4, 8, 17

//Lista => -5,-5, -3, 0, 4, 8, 9, 17

//Lista => -5, -5, -3, 0, 4, 8, 9, 11, 17

//Posteriormente remova todos os números primos da lista e faça a impressão novamente da lista. Criar um vídeo com cerca de10 min explicando o código e apresentando a execução do programa. 


package Hipopotamo;

import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        int[] vetor = new int[1000];
        Random random = new Random();

       
        for (int i = 0; i < 1000; i++) {
            vetor[i] = random.nextInt(19999) - 9999;
        }

        System.out.println("Vetor gerado:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();

        Lista lista = new Lista();

       
        System.out.println("\nInserindo valores na lista:");
        for (int valor : vetor) {
            lista.inserirOrdenado(valor);
        }

        System.out.println("\nLista em ordem decrescente:");
        lista.exibirDecrescente();
    }
}
