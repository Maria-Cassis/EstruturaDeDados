import java.util.Stack;

class Pilha {
    private Stack<Integer> pilha;
    @SuppressWarnings("unused")
    private int topo;

    public Pilha() {
        pilha = new Stack<>();
        topo = -1;
    }

    public boolean estaVazia() {
        return pilha.isEmpty();
    }

    public boolean estaCheia() {
        return pilha.size() == 10;
    }

    public void empilhar(int elemento) {
        if (estaCheia()) {
            System.out.println("Erro: Pilha cheia!");
        } else {
            pilha.push(elemento);
            topo++;
        }
    }

    public int desempilhar() {
        if (estaVazia()) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        } else {
            topo--;
            return pilha.pop();
        }
    }

    public int topo() {
        if (estaVazia()) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        } else {
            return pilha.peek();
        }
    }
}
