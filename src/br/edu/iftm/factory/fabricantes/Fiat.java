package br.edu.iftm.factory.fabricantes;

import br.edu.iftm.factory.ICarro;
import br.edu.iftm.factory.IFabricante;
import br.edu.iftm.factory.IFactory;
import br.edu.iftm.factory.carros.Palio;

public class Fiat implements IFabricante {
    public static IFabricante Instancia = new Fiat();

    private IFactory fabrica = new IFactory() {
        @Override
        public ICarro fabricar() {
            return new Palio();
        }
    };

    @Override
    public String getNome() {
        return "Fiat";
    }

    @Override
    public IFactory getFabrica() {
        return this.fabrica;
    }    
}
