package br.com.gulliver.implementacao;

import br.com.gulliver.beans.Restaurante;

public class TesteRestaurante {
    public static void main(String[] args) {

        Restaurante objRestaurante = new Restaurante(1, "Restaurante 1", "10:00 às 22:00", "R$ 50,00", "Centro", "Brasileira", true, "Restaurante 1");
        
        System.out.println(objRestaurante.toString());
    }
}
