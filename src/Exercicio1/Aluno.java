package Exercicio1;

public class Aluno {
     private String  nome;
     private String sobrenome;
     private int codigoDeAluno;


    //------------------------------------construtores------------------------------------------------------------------
    public Aluno(String nome, String sobrenome, int codigoDeAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoDeAluno = codigoDeAluno;
    }


    public Aluno(int codigoDeAluno) {
        this.codigoDeAluno = codigoDeAluno;
    }
    //------------------------------------construtores------------------------------------------------------------------


    //------------------------------------metodos-----------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return codigoDeAluno == aluno.codigoDeAluno;
    }




    //------------------------------------metodos-----------------------------------------------------------------------


    //------------------------------------get and set-------------------------------------------------------------------
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

    public int getCodigoDeAluno() {
        return codigoDeAluno;
    }

    public void setCodigoDeAluno(int codigoDeAluno) {
        this.codigoDeAluno = codigoDeAluno;
    }
    //------------------------------------get and set-------------------------------------------------------------------

}



