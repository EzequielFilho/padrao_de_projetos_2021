package br.edu.iftm.factory.carros;

import br.edu.iftm.factory.ICarro;
import br.edu.iftm.factory.IFabricante;
import br.edu.iftm.factory.fabricantes.Volkswagen;

public class Gol implements ICarro {
    @Override
    public String getNome() {
        return "Gol";
    }

    @Override
    public IFabricante getFabricante() {
        return Volkswagen.Instancia;
    }    
}
