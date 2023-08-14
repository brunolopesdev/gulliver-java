package br.com.gulliver.implementacao;

import br.com.gulliver.beans.Cidade;

public class TesteCidade {
    public static void main(String[] args) {
        Cidade objCidade = new Cidade(2, "Belo Horizonte", "Minas Gerais", "BH", "Cidade de Minas Gerais");
        
        System.out.println(objCidade.toString());
    }
}
