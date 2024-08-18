package Hipopotamo;
public class Lista {
    private No sentinela;

    public Lista() {
        this.sentinela = new No(0);
        this.sentinela.proximo = sentinela;
        this.sentinela.anterior = sentinela;
    }

    public void inserirOrdenado(int valor) {
        No novoNo = new No(valor);
        No atual = sentinela.proximo;
        while (atual != sentinela && atual.valor < valor) {
            atual = atual.proximo;
        }
        novoNo.proximo = atual;
        novoNo.anterior = atual.anterior;
        atual.anterior.proximo = novoNo;
        atual.anterior = novoNo;
        exibirCrescente();
    }

    public void exibirCrescente() {
        No atual = sentinela.proximo;
        while (atual != sentinela) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void exibirDecrescente() {
        No atual = sentinela.anterior;
        while (atual != sentinela) {
            System.out.print(atual.valor + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }
}
