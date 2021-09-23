package br.edu.iftm.factory.carros;

import br.edu.iftm.factory.ICarro;
import br.edu.iftm.factory.IFabricante;
import br.edu.iftm.factory.fabricantes.Ford;

public class Fiesta implements ICarro {
    @Override
    public String getNome() {
        return "Fiesta";
    }

    @Override
    public IFabricante getFabricante() {
        return Ford.Instancia;
    }    
}
