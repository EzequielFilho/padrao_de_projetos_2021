package br.edu.iftm.decorator;

public abstract class BebidaDecorator implements IBebida {
    private IBebida bebidaBase;

    public BebidaDecorator() {
        this.bebidaBase = null;
    }

    public BebidaDecorator(IBebida bebidaBase) {
        this.bebidaBase = bebidaBase;
    }

    protected abstract String getThisNome();

    protected abstract float getThisPreco();

    @Override
    public String getNome() {
        if(this.bebidaBase != null)
            return this.bebidaBase.getNome() + " com " + this.getThisNome();
        else
            return this.getThisNome();
    }

    @Override
    public float getPreco() {
        if(this.bebidaBase != null)
            return this.bebidaBase.getPreco() + this.getThisPreco();
        else
            return this.getThisPreco();
    }    
}
