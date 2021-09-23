package br.edu.iftm.decorator.coqueteis;

import br.edu.iftm.decorator.BebidaDecorator;
import br.edu.iftm.decorator.IBebida;
import br.edu.iftm.decorator.bebidas.Rum;

public class CubaLibre extends BebidaDecorator {
    public CubaLibre() {
        super(new Rum());
    }

    public CubaLibre(IBebida bebida) {
        super(new Rum(bebida));
    }

    @Override
    protected String getThisNome() {
        return "🥃 Cuba Libre";
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
