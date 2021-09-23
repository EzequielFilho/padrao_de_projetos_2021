package br.edu.iftm.decorator.bebidas;

import br.edu.iftm.decorator.BebidaDecorator;
import br.edu.iftm.decorator.IBebida;

public class Rum extends BebidaDecorator {
    public Rum() {
        super();
    }

    public Rum(IBebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    protected String getThisNome() {
        return "🥃 Rum";
    }

    @Override
    protected float getThisPreco() {
        return 9;
    }
    
}
