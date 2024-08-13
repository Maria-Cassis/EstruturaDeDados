package encadeamento;

public class ListaDuplamenteEncadeada {
    No inicio;
    No fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void remover(int valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor == valor) {
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    inicio = atual.proximo;
                }
                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                } else {
                    fim = atual.anterior;
                }
                break;
            }
            atual = atual.proximo;
        }
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void esvaziar() {
        inicio = null;
        fim = null;
    }

    public int tamanho() {
        int tamanho = 0;
        No atual = inicio;
        while (atual != null) {
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }

    public boolean contem(int valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
}
