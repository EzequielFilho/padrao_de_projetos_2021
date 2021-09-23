package br.edu.iftm.decorator;

import br.edu.iftm.decorator.bebidas.*;
import br.edu.iftm.decorator.complementos.*;
import br.edu.iftm.decorator.coqueteis.*;

public class Program {
    public static void main(String[] args) {
        IBebida[] cardapio = new IBebida[] {
            new Cachaca(),
            new Energetico(),
            new Rum(),
            new Tequila(),
            new Vodka(),
            new Whisky(),
            new Caipirinha(),
            new CubaLibre(),
            new HiFi(),
            new Iogurte(new Caipirinha()),
            new LeiteCondensado(new Caipirinha()),
            new Gelo(new Limao(new Vodka())),
            new Energetico(new Whisky())
        };

        System.out.println("Cardapio:");
        for(IBebida bebida : cardapio)
            System.out.printf("[R$%.02f] %s\n", bebida.getPreco(), bebida.getNome());
    }
}
