package encadeamento;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserir(1); // Usado para Representar o Homer
        lista.inserir(2); // Usado para Representar o Bart
        lista.exibir(); // Exibe:  Homer e Bart ( 1, 2 )

        lista.inserir(3); // Usado para Representar a Lisa
        lista.exibir(); // Exibe: Homer, Bart e Lisa ( 1, 2, 3 )

        System.out.println("Tamanho: " + lista.tamanho());

        lista.remover(1);
        lista.exibir();

        System.out.println("Contém Bart? " + lista.contem(2));

        lista.esvaziar();
        lista.exibir();
    }
}
