package Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private String nome;
    private int codigoDoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private int maximoDeAlunos;
    private List<Aluno> listaDeAlunos = new ArrayList<>();


    //------------------------------------construtores------------------------------------------------------------------

    public Curso(String nome, int codigoDoCurso, int maximoDeAlunos) {
        this.nome = nome;
        this.codigoDoCurso = codigoDoCurso;
        this.maximoDeAlunos = maximoDeAlunos;
    }

    public Curso(int codigoDoCurso) {
        this.codigoDoCurso = codigoDoCurso;
    }
    //------------------------------------construtores------------------------------------------------------------------


    //------------------------------------metodos-----------------------------------------------------------------------
    public Boolean adicionarUmAluno(Aluno umAluno){
        if(listaDeAlunos.size() < maximoDeAlunos ){
            listaDeAlunos.add(umAluno);
            return true;
        } else{
            return false;
        }
    }


    public void excluirAluno(Aluno umAluno){
        listaDeAlunos.remove(umAluno);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codigoDoCurso == curso.codigoDoCurso &&
                maximoDeAlunos == curso.maximoDeAlunos &&
                Objects.equals(nome, curso.nome);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codigoDoCurso=" + codigoDoCurso +
                ", maximoDeAlunos=" + maximoDeAlunos +
                '}';
    }
//------------------------------------metodos-----------------------------------------------------------------------


    //-----------------------------------get and set--------------------------------------------------------------------
    public int getCodigoDoCurso() {
        return codigoDoCurso;
    }

    public void setCodigoDoCurso(int codigoDoCurso) {
        this.codigoDoCurso = codigoDoCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public int getMaximoDeAlunos() {
        return maximoDeAlunos;
    }

    public void setMaximoDeAlunos(int maximoDeAlunos) {
        this.maximoDeAlunos = maximoDeAlunos;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    //-----------------------------------get and set--------------------------------------------------------------------
}
