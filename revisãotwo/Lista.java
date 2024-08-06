package revisãotwo;

public class Lista {
    No cabeca;
    int tamanho;

    public Lista() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return cabeca == null;
    }

    public void inserir(int info) {
        No novoNo = new No(info);
        if (estaVazia() || cabeca.info >= info) {
            novoNo.prox = cabeca;
            cabeca = novoNo;
        } else {
            No atual = cabeca;
            while (atual.prox != null && atual.prox.info < info) {
                atual = atual.prox;
            }
            novoNo.prox = atual.prox;
            atual.prox = novoNo;
        }
        tamanho++;
    }

    public void remover(int info) {
        if (estaVazia()) {
            return;
        }
        if (cabeca.info == info) {
            cabeca = cabeca.prox;
        } else {
            No atual = cabeca;
            while (atual.prox != null && atual.prox.info != info) {
                atual = atual.prox;
            }
            if (atual.prox != null) {
                atual.prox = atual.prox.prox;
            }
        }
        tamanho--;
    }

    public int tamanhoLista() {
        return tamanho;
    }

    public double media() {
        if (estaVazia()) {
            return 0;
        }
        int soma = 0;
        No atual = cabeca;
        while (atual != null) {
            soma += atual.info;
            atual = atual.prox;
        }
        return (double) soma / tamanho;
    }

    public boolean busca(int info) {
        No atual = cabeca;
        while (atual != null) {
            if (atual.info == info) {
                return true;
            }
            atual = atual.prox;
        }
        return false;
    }

    public void elimina(int info) {
        while (busca(info)) {
            remover(info);
        }
    }

    public void eliminaPosicao(int pos) {
        if (pos < 0 || pos >= tamanho) {
            return;
        }
        if (pos == 0) {
            cabeca = cabeca.prox;
        } else {
            No atual = cabeca;
            for (int i = 0; i < pos - 1; i++) {
                atual = atual.prox;
            }
            atual.prox = atual.prox.prox;
        }
        tamanho--;
    }

    public void insereDireita(int pos, int info) {
        if (pos < 0 || pos >= tamanho) {
            return;
        }
        No novoNo = new No(info);
        No atual = cabeca;
        for (int i = 0; i < pos; i++) {
            atual = atual.prox;
        }
        novoNo.prox = atual.prox;
        atual.prox = novoNo;
        tamanho++;
    }

    public void insereEsquerda(int pos, int info) {
        if (pos < 0 || pos >= tamanho) {
            return;
        }
        No novoNo = new No(info);
        if (pos == 0) {
            novoNo.prox = cabeca;
            cabeca = novoNo;
        } else {
            No atual = cabeca;
            for (int i = 0; i < pos - 1; i++) {
                atual = atual.prox;
            }
            novoNo.prox = atual.prox;
            atual.prox = novoNo;
        }
        tamanho++;
    }

    public void imprimirLista() {
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.info + " -> ");
            atual = atual.prox;
        }
        System.out.println("None");
    }

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(3);
        lista.inserir(1);
        lista.inserir(5);
        lista.inserir(2);
        lista.inserir(4);

        System.out.println("Lista após inserções:");
        lista.imprimirLista();

        System.out.println("Tamanho da lista: " + lista.tamanhoLista());
        System.out.println("Média dos elementos: " + lista.media());
        System.out.println("Busca pelo elemento 3: " + (lista.busca(3) ? "Encontrado" : "Não encontrado"));
        System.out.println("Busca pelo elemento 6: " + (lista.busca(6) ? "Encontrado" : "Não encontrado"));

        lista.elimina(3);
        System.out.println("Lista após eliminar todas as ocorrências do elemento 3:");
        lista.imprimirLista();

        lista.eliminaPosicao(2);
        System.out.println("Lista após eliminar o elemento na posição 2:");
        lista.imprimirLista();

        lista.insereDireita(1, 6);
        System.out.println("Lista após inserir 6 à direita da posição 1:");
        lista.imprimirLista();

        lista.insereEsquerda(2, 7);
        System.out.println("Lista após inserir 7 à esquerda da posição 2:");
        lista.imprimirLista();
    }
}
