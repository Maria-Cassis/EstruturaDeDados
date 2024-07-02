
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class TorresDeHanoi2 {

    static class HanoiTask extends RecursiveAction {
        int n;
        char origem, destino, auxiliar;
        boolean verbose;
        long contadorMovimentos;

        HanoiTask(int n, char origem, char destino, char auxiliar, boolean verbose) {
            this.n = n;
            this.origem = origem;
            this.destino = destino;
            this.auxiliar = auxiliar;
            this.verbose = verbose;
            this.contadorMovimentos = 0; // Inicializa o contador de movimentos
        }

        @Override
        protected void compute() {
            if (n <= 5) {
                resolverSequencial(n, origem, destino, auxiliar);
            } else {
                HanoiTask task1 = new HanoiTask(n - 1, origem, auxiliar, destino, false);
                HanoiTask task2 = new HanoiTask(1, origem, destino, auxiliar, verbose);
                HanoiTask task3 = new HanoiTask(n - 1, auxiliar, destino, origem, false);

                invokeAll(task1, task2, task3);

                // Atualiza o contador de movimentos com o total das tarefas filhas
                contadorMovimentos = task1.contadorMovimentos + task2.contadorMovimentos + task3.contadorMovimentos;
            }
        }

        private void resolverSequencial(int n, char origem, char destino, char auxiliar) {
            if (n == 1) {
                if (verbose) {
                    System.out.println("Mover disco 1 de " + origem + " para " + destino);
                }
                contadorMovimentos++;
                return;
            }
            resolverSequencial(n - 1, origem, auxiliar, destino);
            if (verbose) {
                System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
            }
            contadorMovimentos++;
            resolverSequencial(n - 1, auxiliar, destino, origem);
        }
    }

    public static void main(String[] args) {
        int numDiscos = 41;

        long startTime = System.currentTimeMillis();

        long movimento = (long) Math.pow(2, numDiscos) - 1;

        ForkJoinPool pool = new ForkJoinPool();
        HanoiTask task = new HanoiTask(numDiscos, 'A', 'C', 'B', false);
        pool.invoke(task);

        long endTime = System.currentTimeMillis();
        long tempoTotalMillis = endTime - startTime;

        long tempoTotalSegundos = tempoTotalMillis / 1000;
        long minutos = (tempoTotalSegundos % 3600) / 60;
        long segundos = tempoTotalSegundos % 60;
        long milissegundosRestantes = tempoTotalMillis % 1000;

        System.out.println("Número de movimentos calculado: " + movimento);
        System.out.println("Número total de movimentos executado: " + task.contadorMovimentos);
        System.out.format("Tempo total para resolver: %02d minutos %02d segundos %d milissegundos%n", minutos, segundos, milissegundosRestantes);
    }
}