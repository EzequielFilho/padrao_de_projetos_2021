package br.edu.iftm.observer;

public class Aluno implements IObserver {
    private int matricula;

    public Aluno(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public void notifyAssinatura(Revista revista) {
        System.out.printf("📖 Opa! Eu, aluno %d, quero a nova versão da revista %s!\n", matricula, revista.getTitulo());
    }    
}
