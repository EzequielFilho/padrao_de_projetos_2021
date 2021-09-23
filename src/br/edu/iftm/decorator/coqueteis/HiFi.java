package br.edu.iftm.decorator.coqueteis;

import br.edu.iftm.decorator.BebidaDecorator;
import br.edu.iftm.decorator.IBebida;
import br.edu.iftm.decorator.bebidas.Cachaca;
import br.edu.iftm.decorator.bebidas.Vodka;
import br.edu.iftm.decorator.complementos.Limao;

public class HiFi extends BebidaDecorator {
    public HiFi() {
        super(new Limao(new Vodka(new Cachaca())));
    }

    public HiFi(IBebida bebida) {
        super(new Limao(new Vodka(new Cachaca(bebida))));
    }

    @Override
    protected String getThisNome() {
        return "🍹 HiFi";
    }

    @Override
    protected float getThisPreco() {
        return 4;
    }   

    @Override
    public String getNome() {
        return this.getThisNome();
    }   
}
