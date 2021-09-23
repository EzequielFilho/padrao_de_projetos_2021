package br.edu.iftm.decorator.bebidas;

import br.edu.iftm.decorator.BebidaDecorator;
import br.edu.iftm.decorator.IBebida;

public class Cachaca extends BebidaDecorator {
    public Cachaca() {
        super();
    }

    public Cachaca(IBebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    protected String getThisNome() {
        return "🍶 Cachaça";
    }

    @Override
    protected float getThisPreco() {
        return 2;
    }
    
}
