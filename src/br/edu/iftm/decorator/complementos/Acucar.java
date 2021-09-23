package br.edu.iftm.decorator.complementos;

import br.edu.iftm.decorator.BebidaDecorator;
import br.edu.iftm.decorator.IBebida;

public class Acucar extends BebidaDecorator {
    public Acucar() {
        super();
    }

    public Acucar(IBebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    protected String getThisNome() {
        return "Açucar";
    }

    @Override
    protected float getThisPreco() {
        return 2;
    } 
}
