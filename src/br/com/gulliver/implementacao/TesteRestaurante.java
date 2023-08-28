package br.com.gulliver.implementacao;

import br.com.gulliver.beans.Restaurante;

public class TesteRestaurante {
    public static void main(String[] args) {

        Restaurante objRestaurante = new Restaurante(1, "Restaurante", "São Paulo", "SP", "História", "10:00 às 22:00", "R$ 100,00", "Culinária", "Culinária", true, "Descrição");
        
        System.out.println(objRestaurante.toString());
    }
}
