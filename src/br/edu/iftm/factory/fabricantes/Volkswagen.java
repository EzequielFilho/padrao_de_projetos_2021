package br.edu.iftm.factory.fabricantes;

import br.edu.iftm.factory.ICarro;
import br.edu.iftm.factory.IFabricante;
import br.edu.iftm.factory.IFactory;
import br.edu.iftm.factory.carros.Gol;

public class Volkswagen implements IFabricante {
    public static IFabricante Instancia = new Volkswagen();

    private IFactory fabrica = new IFactory() {
        @Override
        public ICarro fabricar() {
            return new Gol();
        }
    };

    @Override
    public String getNome() {
        return "Volkswagen";
    }

    @Override
    public IFactory getFabrica() {
        return this.fabrica;
    }    
}
