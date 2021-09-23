package br.edu.iftm.decorator.coqueteis;

import br.edu.iftm.decorator.BebidaDecorator;
import br.edu.iftm.decorator.IBebida;
import br.edu.iftm.decorator.bebidas.Cachaca;

public class Caipirinha extends BebidaDecorator {
    public Caipirinha() {
        super(new Cachaca());
    }
    
    public Caipirinha(IBebida bebida) {
        super(new Cachaca(bebida));
    }

    @Override
    protected String getThisNome() {
        return "🍋 Caipirinha";
    }

    @Override
    protected float getThisPreco() {
        return 6;
    }

    @Override
    public String getNome() {
        return this.getThisNome();
    }
}
