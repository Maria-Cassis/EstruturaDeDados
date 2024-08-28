public class Pessoa {
    int id;
    String sexo;
    int idade;
    boolean gestante;
    boolean lactante;
    boolean necessidadeEspecial;
    int prioridade;

    public Pessoa(int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial, int prioridade) {
        this.id = id;
        this.sexo = sexo;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadeEspecial = necessidadeEspecial;
        this.prioridade = calcularPrioridade();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isGestante() {
        return gestante;
    }

    public void setGestante(boolean gestante) {
        this.gestante = gestante;
    }

    public boolean isLactante() {
        return lactante;
    }

    public void setLactante(boolean lactante) {
        this.lactante = lactante;
    }

    public boolean isNecessidadeEspecial() {
        return necessidadeEspecial;
    }

    public void setNecessidadeEspecial(boolean necessidadeEspecial) {
        this.necessidadeEspecial = necessidadeEspecial;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }


    private int calcularPrioridade() {
        if (gestante || lactante) {
            return 3;
        } else if (necessidadeEspecial) {
            return 2;
        } else if (idade >= 60) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", gestante=" + gestante +
                ", lactante=" + lactante +
                ", necessidadeEspecial=" + necessidadeEspecial +
                ", prioridade=" + prioridade +
                '}';
    }
}
