package Exercicio1;

public class Professor {

    private String nome;
    private String sobrenome;
    private int tempodecasa;
    private  int codigoProfessor;


    //------------------------------------construtores------------------------------------------------------------------

    public Professor(String nome, String sobrenome, int tempodecasa, int codigoProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempodecasa = tempodecasa;
        this.codigoProfessor = codigoProfessor;
    }
    //------------------------------------construtores------------------------------------------------------------------


    //------------------------------------metodos-----------------------------------------------------------------------
    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", tempodecasa=" + tempodecasa +
                ", codigoProfessor=" + codigoProfessor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return codigoProfessor == professor.codigoProfessor;
    }
    //------------------------------------metodos-----------------------------------------------------------------------


    //-----------------------------------get and set--------------------------------------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getTempodecasa() {
        return tempodecasa;
    }

    public void setTempodecasa(int tempodecasa) {
        this.tempodecasa = tempodecasa;
    }

    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(int codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    //-----------------------------------get and set--------------------------------------------------------------------
}
