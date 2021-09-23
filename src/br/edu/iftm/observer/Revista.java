package br.edu.iftm.observer;

import java.util.ArrayList;
import java.util.List;

public class Revista {
    private List<IObserver> observers = new ArrayList<IObserver>();

    private String titulo;
    private int edicao;
    private int ano;
    private String link;

    public Revista(String titulo, int edicao, int ano, String link) {
        this.titulo = titulo;
        this.edicao = edicao;
        this.ano = ano;
        this.link = link;
    }

    public void registrarAssinatura(Aluno aluno) {
        this.observers.add(aluno);
    }

    public void removerAssinatura(Aluno aluno) {
        this.observers.remove(aluno);
    }

    public void notificarAssinantes() {
        for(IObserver observer : observers)
            observer.notifyAssinatura(this);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getEdicao() {
        return this.edicao;
    }

    public int getAno() {
        return this.ano;
    }

    public String getLink() {
        return this.link;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
