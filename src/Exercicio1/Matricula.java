package Exercicio1;

import java.util.Date;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private Date dataDeMatricula = new Date();

    //------------------------------------construtores------------------------------------------------------------------

    public Matricula(Aluno aluno, Curso curso, Date dataDeMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataDeMatricula = dataDeMatricula;
    }

    //------------------------------------construtores------------------------------------------------------------------


    //------------------------------------metodos-----------------------------------------------------------------------

    @Override
    public String toString() {
        return "Matricula{" +
                "aluno=" + aluno +
                ", curso=" + curso +
                ", dataDeMatricula=" + dataDeMatricula +
                '}';
    }


    //------------------------------------metodos-----------------------------------------------------------------------


    //-----------------------------------get and set--------------------------------------------------------------------
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataDeMatricula() {
        return dataDeMatricula;
    }

    public void setDataDeMatricula(Date dataDeMatricula) {
        this.dataDeMatricula = dataDeMatricula;
    }

    //-----------------------------------get and set--------------------------------------------------------------------
}
