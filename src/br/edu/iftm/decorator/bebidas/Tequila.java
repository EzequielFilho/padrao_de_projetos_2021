package br.edu.iftm.decorator.bebidas;

import br.edu.iftm.decorator.BebidaDecorator;
import br.edu.iftm.decorator.IBebida;

public class Tequila extends BebidaDecorator {
    public Tequila() {
        super();
    }

    public Tequila(IBebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    protected String getThisNome() {
        return "🌶️ Tequila";
    }

    @Override
    protected float getThisPreco() {
        return 8;
    }    
}
