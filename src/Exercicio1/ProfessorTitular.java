package Exercicio1;

public class ProfessorTitular extends Professor {

    private String especialidade;

    public ProfessorTitular(String nome, String sobrenome, int tempodecasa, int codigoProfessor, String especialidade) {
        super(nome, sobrenome, tempodecasa, codigoProfessor);
        this.especialidade = especialidade;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
