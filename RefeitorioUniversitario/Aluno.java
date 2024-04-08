package RefeitorioUniversitario;

public class Aluno extends Pessoa{ 
    int matricula;
    String nome;
    String curso;

     Aluno(int matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
}

}