package br.edu.iftm.factory.fabricantes;

import br.edu.iftm.factory.ICarro;
import br.edu.iftm.factory.IFabricante;
import br.edu.iftm.factory.IFactory;
import br.edu.iftm.factory.carros.Celta;

public class Chevrolet implements IFabricante {
    public static IFabricante Instancia = new Chevrolet();

    private IFactory fabrica = new IFactory() {
        @Override
        public ICarro fabricar() {
            return new Celta();
        }
    };

    @Override
    public String getNome() {
        return "Chevrolet";
    }

    @Override
    public IFactory getFabrica() {
        return this.fabrica;
    }    
}
