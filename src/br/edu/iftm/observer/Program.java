package br.edu.iftm.observer;

public class Program {
    public static void main(String[] args) {
        Revista revista1 = new Revista("Revista 1", 1, 2021, "https://revista.um");
        Revista revista2 = new Revista("Revista 2", 1, 2021, "https://revista.dois");
        Revista revista3 = new Revista("Revista 3", 1, 2021, "https://revista.tres");
        Revista[] revistas = new Revista[] {
            revista1,
            revista2,
            revista3
        };

        Aluno aluno1 = new Aluno(123456);
        Aluno aluno2 = new Aluno(654321);

        revista1.registrarAssinatura(aluno1);
        revista1.registrarAssinatura(aluno2);

        revista2.registrarAssinatura(aluno1);

        revista3.registrarAssinatura(aluno2);

        for(Revista revista : revistas)
            revista.notificarAssinantes();
    }
}
