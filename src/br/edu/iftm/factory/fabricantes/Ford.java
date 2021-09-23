package br.edu.iftm.factory.fabricantes;

import br.edu.iftm.factory.ICarro;
import br.edu.iftm.factory.IFabricante;
import br.edu.iftm.factory.IFactory;
import br.edu.iftm.factory.carros.Fiesta;

public class Ford implements IFabricante {
    public static IFabricante Instancia = new Ford();

    private IFactory fabrica = new IFactory() {
        @Override
        public ICarro fabricar() {
            return new Fiesta();
        }
    };

    @Override
    public String getNome() {
        return "Ford";
    }

    @Override
    public IFactory getFabrica() {
        return this.fabrica;
    }    
}
