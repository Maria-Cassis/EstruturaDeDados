package RefeitorioUniversitario;
import java.util.*;
public class FilaRefeitorio {
    Queue<Pessoa> fila = new LinkedList<>();

    // metodo para adicionar uma pessoa na fila do refeitorio 
    void adicionarPessoa(Pessoa pessoa){
        fila.add(pessoa);
    }
    // metodo para remover uma pessoa da fila do refeitorio e rotornar uma instanciada classe especifica
    Pessoa removerDaFila(){
        return fila.poll();
    }
}
