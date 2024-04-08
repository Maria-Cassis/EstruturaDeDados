package RefeitorioUniversitario;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        FilaRefeitorio filaRefeitorio = new FilaRefeitorio();
        Scanner scanner = new Scanner(System.in);

        // Loop principal
        while (true) {
            System.out.println("\nDigite 1 para adicionar uma pessoa na fila, 2 para remover ou 0 para sair:");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (escolha == 0) {
                System.out.println("Programa encerrado.");
                break; // Encerra o loop e o programa
            } else if (escolha == 1) {
                System.out.println("\nEscolha o tipo de pessoa que deseja adicionar: ");
                System.out.println("1 - Aluno");
                System.out.println("2 - Professor");
                System.out.println("3 - Técnico Administrativo");
                int tipoPessoa = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                System.out.println("\nDigite o nome da pessoa: ");
                String nome = scanner.nextLine();

                if (tipoPessoa == 1) {
                    System.out.println("Digite a matrícula do aluno: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("Digite o curso do aluno: ");
                    String curso = scanner.nextLine();
                    Aluno aluno = new Aluno(matricula, nome, curso);
                    filaRefeitorio.adicionarPessoa(aluno);
                } else if (tipoPessoa == 2) {
                    System.out.println("Digite o SIAPE do professor: ");
                    int siape = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("Digite a titulação do professor: ");
                    String titulacao = scanner.nextLine();
                    Professor professor = new Professor(siape, nome, titulacao);
                    filaRefeitorio.adicionarPessoa(professor);
                } else if (tipoPessoa == 3) {
                    System.out.println("Digite o SIAPE do técnico administrativo: ");
                    int siape = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    TecnicoAdministrativo tecnico = new TecnicoAdministrativo(siape, nome);
                    filaRefeitorio.adicionarPessoa(tecnico);
                } else {
                    System.out.println("Opção inválida.");
                }
            } else if (escolha == 2) {
                Pessoa pessoaNaFrente = filaRefeitorio.removerDaFila();
                if (pessoaNaFrente != null) {
                    if (pessoaNaFrente instanceof Aluno) {
                        System.out.println("Removido: Aluno " + ((Aluno) pessoaNaFrente).nome);
                    } else if (pessoaNaFrente instanceof Professor) {
                        System.out.println("Removido: Professor " + ((Professor) pessoaNaFrente).nome);
                    } else if (pessoaNaFrente instanceof TecnicoAdministrativo) {
                        System.out.println("Removido: Técnico Administrativo " + ((TecnicoAdministrativo) pessoaNaFrente).nome);
                    }
                } else {
                    System.out.println("Não há ninguém na fila.");
                }
            } else {
                System.out.println("Opção inválida.");
            }

            System.out.println("\nFila do refeitório:");
            for (Pessoa pessoa : filaRefeitorio.fila) {
                if (pessoa instanceof Aluno) {
                    System.out.println("Aluno: " + ((Aluno) pessoa).nome);
                } else if (pessoa instanceof Professor) {
                    System.out.println("Professor: " + ((Professor) pessoa).nome);
                } else if (pessoa instanceof TecnicoAdministrativo) {
                    System.out.println("Técnico Administrativo: " + ((TecnicoAdministrativo) pessoa).nome);
                }
            }
        }
    }
}