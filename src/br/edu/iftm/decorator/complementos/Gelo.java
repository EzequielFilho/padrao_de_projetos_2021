package br.edu.iftm.decorator.complementos;

import br.edu.iftm.decorator.BebidaDecorator;
import br.edu.iftm.decorator.IBebida;

public class Gelo extends BebidaDecorator {
    public Gelo() {
        super();
    }

    public Gelo(IBebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    protected String getThisNome() {
        return "Gelo";
    }

    @Override
    protected float getThisPreco() {
        return 0.5F;
    }    
}
