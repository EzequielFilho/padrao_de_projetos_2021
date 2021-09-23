package br.edu.iftm.decorator.complementos;

import br.edu.iftm.decorator.BebidaDecorator;
import br.edu.iftm.decorator.IBebida;

public class LeiteCondensado extends BebidaDecorator {
    public LeiteCondensado() {
        super();
    }

    public LeiteCondensado(IBebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    protected String getThisNome() {
        return "Leite Condensado";
    }

    @Override
    protected float getThisPreco() {
        return 6;
    }    
}
