package br.edu.iftm.factory;

import br.edu.iftm.factory.fabricantes.*;

public class Program {
    public static void main(String[] args) {
        IFabricante[] fabricantes = new IFabricante[] {
            new Fiat(),
            new Volkswagen(),
            new Chevrolet(),
            new Ford()
        };

        for(IFabricante fabricante : fabricantes)
            System.out.printf("%s - %s\n", 
                fabricante.getFabrica().fabricar().getNome(), 
                fabricante.getNome());
    }
}
