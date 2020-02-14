package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    public List<Aluno> listaDeAlunos = new ArrayList<>();
    public List<Aluno> getListaDeAlunosMatriculados = new ArrayList<>();
    public List<Professor> listaDeProfessores = new ArrayList<>();
    public List<Curso> listaDeCursos = new ArrayList<>();
    public List<Matricula> listaDaMatricula = new ArrayList<>();

    //-----------------------------------cursos-------------------------------------------------------------------------
    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        listaDeCursos.add(curso);
        System.out.println(listaDeCursos);
    }


    public void excluirCurso(Integer codigoCurso) {

        for (int i = 0; i < listaDeCursos.size(); i++) {
            if (listaDeCursos.get(i).getCodigoDoCurso() == codigoCurso) {
                listaDeCursos.remove(i);
                System.out.println(listaDeCursos);
            }
        }

    }
    //-----------------------------------cursos-------------------------------------------------------------------------


    //-----------------------------------professores--------------------------------------------------------------------
    public void registrarProfessorAdjunto(String nome, String sobrenome, int tempodecasa, int codigoProfessor, int quantidadeDeHoras) {
        ProfessorAdjunto adjunto = new ProfessorAdjunto(nome, sobrenome, tempodecasa, codigoProfessor, quantidadeDeHoras);
        listaDeProfessores.add(adjunto);
        System.out.println(listaDeProfessores);
    }


    public void registrarProfessorTitular(String nome, String sobrenome, int tempodecasa, int codigoProfessor, String especialidade) {
        ProfessorTitular titular = new ProfessorTitular(nome, sobrenome, tempodecasa, codigoProfessor, especialidade);
        listaDeProfessores.add(titular);
        System.out.println(listaDeProfessores);
    }


    public void excluirProfessor(Integer codigoProfessor) {
        for (int i = 0; i < listaDeProfessores.size(); i++) {
            if (listaDeProfessores.get(i).getCodigoProfessor() == codigoProfessor) {
                listaDeProfessores.remove(i);
                System.out.println(listaDeCursos);
            }
        }
    }

    //-----------------------------------professores--------------------------------------------------------------------


    //-----------------------------------Alunos-------------------------------------------------------------------------
    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        listaDeAlunos.add(aluno);
        System.out.println(listaDeAlunos);
    }

    public void matricularAlunoEmCurso(Integer codigoAluno, Integer codigoCurso) {
        Aluno aluno = new Aluno(codigoAluno);
        Curso curso = new Curso(codigoCurso);
        for (int i = 0; i < listaDeCursos.size(); i++) {
            if (listaDeCursos.get(i).getCodigoDoCurso() == codigoCurso) {
                System.out.println(listaDeCursos.get(i));
            }
        }

            for (int x = 0; x < listaDeAlunos.size(); x++) {
                if (listaDeAlunos.get(x).getCodigoDeAluno() == codigoAluno) {
                    System.out.println(listaDeAlunos.get(x));
                }
            }


                System.out.println(listaDaMatricula);

    }



}