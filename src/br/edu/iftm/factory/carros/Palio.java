package br.edu.iftm.factory.carros;

import br.edu.iftm.factory.ICarro;
import br.edu.iftm.factory.IFabricante;
import br.edu.iftm.factory.fabricantes.Fiat;

public class Palio implements ICarro {
    @Override
    public String getNome() {
        return "Palio";
    }

    @Override
    public IFabricante getFabricante() {
        return Fiat.Instancia;
    }    
}
