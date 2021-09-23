package br.edu.iftm.decorator.complementos;

import br.edu.iftm.decorator.BebidaDecorator;
import br.edu.iftm.decorator.IBebida;

public class Iogurte extends BebidaDecorator {
    public Iogurte() {
        super();
    }

    public Iogurte(IBebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    protected String getThisNome() {
        return "Iogurte";
    }

    @Override
    protected float getThisPreco() {
        return 5;
    }    
}
