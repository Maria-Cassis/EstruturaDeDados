import java.util.LinkedList;

public class DequeCircular {
    LinkedList<Pessoa> deque;

    public DequeCircular() {
        deque = new LinkedList<>();
    }

    public void adicionarPessoa(Pessoa p) {
        int index = 0;
        while (index < deque.size() && deque.get(index).prioridade >= p.prioridade) {
            index++;
        }
        deque.add(index, p);
    }

    public Pessoa atenderPessoa() {
        if (!deque.isEmpty()) {
            return deque.poll();
        }
        return null;
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    @Override
    public String toString() {
        return deque.toString();
    }
}