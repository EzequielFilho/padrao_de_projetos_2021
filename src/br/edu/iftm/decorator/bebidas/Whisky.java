package br.edu.iftm.decorator.bebidas;

import br.edu.iftm.decorator.BebidaDecorator;
import br.edu.iftm.decorator.IBebida;

public class Whisky extends BebidaDecorator {
    public Whisky() {
        super();
    }

    public Whisky(IBebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    protected String getThisNome() {
        return "🥃 Whisky";
    }

    @Override
    protected float getThisPreco() {
        return 10;
    }    
}
