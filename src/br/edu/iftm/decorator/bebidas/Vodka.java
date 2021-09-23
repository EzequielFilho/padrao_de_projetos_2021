package br.edu.iftm.decorator.bebidas;

import br.edu.iftm.decorator.BebidaDecorator;
import br.edu.iftm.decorator.IBebida;

public class Vodka extends BebidaDecorator {
    public Vodka() {
        super();
    }

    public Vodka(IBebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    protected String getThisNome() {
        return "🍸 Vodka";
    }

    @Override
    protected float getThisPreco() {
        return 6;
    }    
}
