package Exercicio1;

public class Professor {

    private String nome;
    private String sobrenome;
    private int tempodecasa;
    private  int codigoProfessor;



    public Professor(String nome, String sobrenome, int tempodecasa, int codigoProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempodecasa = tempodecasa;
        this.codigoProfessor = codigoProfessor;
    }

    public void mesmoProfessor(int codigo, int codigo2){
        if(codigo == codigo2 ){
            System.out.println("eles possuem o mesmo codigo");
        } else {
            System.out.println("eles não tem o mesmo codigo");
        }
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

}
