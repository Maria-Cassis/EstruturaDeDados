package exerciciosderesivao;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

public class FilaEPilha {

    public static void main(String[] args) {
        Queue<Integer> filaF = new LinkedList<>();
        Stack<Integer> pilhaP = new Stack<>();
        Set<Integer> numerosPresentes = new HashSet<>();
        Random random = new Random();

        // Sortear e inserir números
        for (int i = 0; i < 1000; i++) {
            int numeroSorteado = random.nextInt(10000); // Números aleatórios entre 0 e 9999

            if (numerosPresentes.contains(numeroSorteado)) {
                // Se o número já está na fila, insira na pilha
                pilhaP.push(numeroSorteado);
            } else {
                // Se o número não está na fila, adicione à fila e ao conjunto
                filaF.add(numeroSorteado);
                numerosPresentes.add(numeroSorteado);
            }
        }

        // Imprimir a fila e a pilha
        System.out.println("Fila F (sem números duplicados):\n " + filaF);
        System.out.println("Pilha P (números duplicados): " + pilhaP);
    }
}
