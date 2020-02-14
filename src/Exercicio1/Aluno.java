package Exercicio1;

public class Aluno {
     private String  nome;
     private String sobrenome;
    private int codigoDeAluno;


    public Aluno(String nome, String sobrenome, int codigoDeAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoDeAluno = codigoDeAluno;
    }

    public void mesmoAluno(int aluno, int aluno2 ){
        if(aluno == aluno2 ){
            System.out.println("eles possuem o mesmo codigo");
        } else {
            System.out.println("eles não tem o mesmo codigo");
        }
    }


    @Override
    public int hashCode() {
        return 0;
    }

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
}



