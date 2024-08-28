import java.util.Random;

public class PostoSaude {
    public static void main(String[] args) {
        DequeCircular fila = new DequeCircular();
        Random random = new Random();
        int totalAtendidos = 0;
        int grupo = 1;


        for (int i = 1; i <= 100; i += 10) {
            for (int j = 0; j < 10; j++) {
                int id = i + j;
                boolean necessidadeEspecial = j == 0;
                boolean gestante = j == 1 && random.nextBoolean();
                boolean lactante = j == 2 && !gestante && random.nextBoolean();
                int idade = j < 6 ? random.nextInt(50) : 60 + random.nextInt(40);
                fila.adicionarPessoa(new Pessoa(1, "F", 5, false, true, false,5));
                fila.adicionarPessoa(new Pessoa(2, "M", 65, false, false, false, 1));
                fila.adicionarPessoa(new Pessoa(3, "F", 29, true, false, false, 3));
                fila.adicionarPessoa(new Pessoa(4, "M", 45, false, false, true, 2));
                fila.adicionarPessoa(new Pessoa(5, "F", 35, false, true, false, 3));
                fila.adicionarPessoa(new Pessoa(6, "M", 70, false, false, false, 1));
                fila.adicionarPessoa(new Pessoa(7, "F", 55, false, false, false, 0));
                fila.adicionarPessoa(new Pessoa(8, "M", 30, false, false, true, 2));
                fila.adicionarPessoa(new Pessoa(9, "F", 80, false, false, false, 1));
                fila.adicionarPessoa(new Pessoa(10, "M", 18, false, false, false, 0));
                fila.adicionarPessoa(new Pessoa(11, "F", 40, true, false, false, 3));

            }


            for (int k = 0; k < grupo && totalAtendidos < 100; k++) {
                Pessoa atendida = fila.atenderPessoa();
                if (atendida != null) {
                    System.out.println("Atendendo: " + atendida);
                    totalAtendidos++;
                }
            }
            grupo++;
        }

        System.out.println("\nPessoas não atendidas:");
        while (!fila.isEmpty()) {
            System.out.println(fila.atenderPessoa());
        }
    }
}