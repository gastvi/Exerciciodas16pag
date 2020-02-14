package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

private Curso curso;
private ProfessorAdjunto professorAdjunto;
private ProfessorTitular professorTitular;
private Matricula matricula;


    public Boolean adicionaraluno(Aluno aluno) {

        List<Aluno> lista = new ArrayList<>();
        if (lista.size() < Curso.maximoDeAlunos()) {
            lista.add(aluno);
            return true;
        }else {
            return false;
        }
    }


    public  void visualizaralunos(){
        List<Aluno> lista= new ArrayList<>();
        for (Aluno veralunos: lista) {
            System.out.println(lista);
        }
    }

    public void adicionarprofessor(Professor professor) {

        List<Professor> lista2= new ArrayList<>();
            lista2.add(professor);
        System.out.println(lista2);
    }

    public void excluirprofessor(int professor) {

        List<Professor> lista2= new ArrayList<>();
        lista2.remove(professor);
    }






    public void adicionarcurso(Curso curso) {

        List<Curso> lista3= new ArrayList<>();
            lista3.add(curso);
        System.out.println(lista3);

    }

    public void excluirCurso(int codigoCurso){
        List<Curso> lista3= new ArrayList<>();
        lista3.remove(codigoCurso);
    }

    public  void visualizarcurso(Curso curso){
        List<Curso> lista3= new ArrayList<>();
        for (Curso vercurso: lista3) {
            System.out.println(lista3);
        }
    }


    public void adicionarmatricula(Matricula matricula) {

        List<Matricula> lista4= new ArrayList<>();
            lista4.add(matricula);
        System.out.println(lista4);
    }

}
