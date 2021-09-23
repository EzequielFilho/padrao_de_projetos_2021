package br.edu.iftm.decorator.bebidas;

import br.edu.iftm.decorator.BebidaDecorator;
import br.edu.iftm.decorator.IBebida;

public class Energetico extends BebidaDecorator {
    public Energetico() {
        super();
    }

    public Energetico(IBebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    protected String getThisNome() {
        return "⚡ Energetico";
    }

    @Override
    protected float getThisPreco() {
        return 5;
    }
    
}
