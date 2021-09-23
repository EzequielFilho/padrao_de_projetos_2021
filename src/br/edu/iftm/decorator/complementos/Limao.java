package br.edu.iftm.decorator.complementos;

import br.edu.iftm.decorator.BebidaDecorator;
import br.edu.iftm.decorator.IBebida;

public class Limao extends BebidaDecorator {
    public Limao() {
        super();
    }

    public Limao(IBebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    protected String getThisNome() {
        return "Limão";
    }

    @Override
    protected float getThisPreco() {
        return 2;
    }    
}
