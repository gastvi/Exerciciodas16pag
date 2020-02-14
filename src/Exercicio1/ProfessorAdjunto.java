package Exercicio1;

public class ProfessorAdjunto extends Professor {

    private int horasMonitoradas;

    public ProfessorAdjunto(String nome, String sobrenome, int tempodecasa, int codigoProfessor, int horasMonitoradas) {
        super(nome, sobrenome, tempodecasa, codigoProfessor);
        this.horasMonitoradas = horasMonitoradas;
    }

    public int getHorasMonitoradas() {
        return horasMonitoradas;
    }

    public void setHorasMonitoradas(int horasMonitoradas) {
        this.horasMonitoradas = horasMonitoradas;
    }
}
