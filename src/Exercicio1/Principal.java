package Exercicio1;

public class Principal {

    public static void main(String[] args) {
        Aluno objaluno = new Aluno("Jonas", "silva", 2315);
        Aluno objaluno2 = new Aluno("João", "felipe", 5423);
        Aluno objaluno3 = new Aluno("Jonas", "Santos", 2871);
        Aluno objaluno4 = new Aluno("Jonas", "felipe", 5135);
        Aluno objaluno5 = new Aluno("Jonas", "felipe", 4692);
        Aluno objaluno6 = new Aluno("Jonas", "felipe", 6582);

        ProfessorTitular objtitular = new ProfessorTitular("Gabriel", "Stefanoni", 0,
                7634,"Desenvolverdor");
        ProfessorTitular objtitular2 = new ProfessorTitular("Douglas", "Yugo", 0,
                7512,"banco de daods");
        ProfessorAdjunto objadjunto = new ProfessorAdjunto("Renato", "Viestel", 0,
                8464,0);
        ProfessorAdjunto objadjunto2 = new ProfessorAdjunto("Andreia", "Machado", 0,
                8249,0);

        Curso objcurso = new Curso("Full Stack", 20001, 3 );
        Curso objcurso2 = new Curso("Android", 20002, 2 );

         DigitalHouseManager objmanager = new DigitalHouseManager();

         objmanager.registrarCurso("Full Stack", 20001, 4);
         objmanager.excluirCurso(20001);

objmanager.registrarProfessorAdjunto("Gabriel", "Stefanoni", 0, 2454,0);

    }
}
