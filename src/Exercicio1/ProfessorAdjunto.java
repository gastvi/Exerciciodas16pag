package Exercicio1;

public class ProfessorAdjunto extends Professor {

    private int horasMonitoradas = 0;

    //------------------------------------construtores------------------------------------------------------------------

    public ProfessorAdjunto(String nome, String sobrenome, int tempodecasa, int codigoProfessor) {
        super(nome, sobrenome, tempodecasa, codigoProfessor);
    }

    public ProfessorAdjunto(String nome, String sobrenome, int tempodecasa, int codigoProfessor, int horasMonitoradas) {
        super(nome, sobrenome, tempodecasa, codigoProfessor);
        this.horasMonitoradas = horasMonitoradas;
    }
    //------------------------------------construtores------------------------------------------------------------------


    //------------------------------------metodos-----------------------------------------------------------------------
    @Override
    public String toString() {
        return "ProfessorAdjunto{" +
                "horasMonitoradas=" + horasMonitoradas +
                '}';
    }
//------------------------------------metodos-----------------------------------------------------------------------

    //-----------------------------------get and set--------------------------------------------------------------------
    public int getHorasMonitoradas() {
        return horasMonitoradas;
    }

    public void setHorasMonitoradas(int horasMonitoradas) {
        this.horasMonitoradas = horasMonitoradas;
    }
    //-----------------------------------get and set--------------------------------------------------------------------
}
