package Exercicio1;

public class ProfessorTitular extends Professor {

    private String especialidade;


    //------------------------------------construtores------------------------------------------------------------------

    public ProfessorTitular(String nome, String sobrenome, int tempodecasa, int codigoProfessor) {
        super(nome, sobrenome, tempodecasa, codigoProfessor);
    }

    public ProfessorTitular(String nome, String sobrenome, int tempodecasa, int codigoProfessor, String especialidade) {
        super(nome, sobrenome, tempodecasa, codigoProfessor);
        this.especialidade = especialidade;
    }
    //------------------------------------construtores------------------------------------------------------------------


    //------------------------------------metodos-----------------------------------------------------------------------

    @Override
    public String toString() {
        return "ProfessorTitular{" +
                "especialidade='" + especialidade + '\'' +
                '}';
    }

    //------------------------------------metodos-----------------------------------------------------------------------

    //-----------------------------------get and set--------------------------------------------------------------------

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    //-----------------------------------get and set--------------------------------------------------------------------
}
