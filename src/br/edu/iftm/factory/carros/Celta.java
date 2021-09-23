package br.edu.iftm.factory.carros;

import br.edu.iftm.factory.ICarro;
import br.edu.iftm.factory.IFabricante;
import br.edu.iftm.factory.fabricantes.Chevrolet;

public class Celta implements ICarro {
    @Override
    public String getNome() {
        return "Celta";
    }

    @Override
    public IFabricante getFabricante() {
        return Chevrolet.Instancia;
    }    
}
