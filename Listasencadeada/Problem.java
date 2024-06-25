package Listasencadeada;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Problem  {
    public static int encontrarSobrevivente(int totalPessoas, int m) {
        List<Pessoa> pessoas = new ArrayList<>();
        for (int i = 1; i <= totalPessoas; i++) {
            pessoas.add(new Pessoa("Pessoa " + i, "Telefone", "Endereço", "CPF"));
        }

        int indice = 0;
        while (pessoas.size() > 1) {
            indice = (indice + m - 1) % pessoas.size();
            pessoas.remove(indice);
        }

        return pessoas.get(0).getNome().charAt(pessoas.get(0).getNome().length() - 1) - '0';
    }

    public static void main(String[] args) {
        int totalPessoas = 20;
        int m = new Random().nextInt(totalPessoas) + 1; 

        System.out.println("Número m escolhido: " + m);
        int sobrevivente = encontrarSobrevivente(totalPessoas, m);
        System.out.println("A pessoa sobrevivente é a de número: " + sobrevivente);
    }
}