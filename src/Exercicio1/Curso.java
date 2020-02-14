package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private int codigoDoCurso;
    private  int maximoDeAlunos;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;


    public Curso(String nome, int codigoDoCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto,
                 int maximoDeAlunos) {
        this.nome = nome;
        this.codigoDoCurso = codigoDoCurso;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.maximoDeAlunos = maximoDeAlunos;
    }


    public Boolean adicionaraluno(Aluno aluno) {

        List<Aluno> lista = new ArrayList<>();
        if (lista.size() < maximoDeAlunos) {
            lista.add(aluno);
            return true;
        }else {
            return false;
        }
    }


    public void excluirAluno(Aluno umAluno){
        List<Aluno> lista= new ArrayList<>();
        lista.remove(umAluno);
    }


    public  void visualizaralunos(){
        List<Aluno> lista= new ArrayList<>();
        for (Aluno veralunos: lista) {
            System.out.println(lista);
        }
    }


    public void mesmoCurso(int codigo, int codigo2){
        if(codigo == codigo2 ){
            System.out.println("eles possuem o mesmo codigo");
        } else {
            System.out.println("eles não tem o mesmo codigo");
        }
    }



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
}
