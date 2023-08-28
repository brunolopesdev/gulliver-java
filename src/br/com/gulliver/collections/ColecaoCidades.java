package br.com.gulliver.collections;

import br.com.gulliver.beans.Cidade;
import java.util.ArrayList;
import java.util.List;

public class ColecaoCidades {
    private List<Cidade> cidades;

    public ColecaoCidades() {
        cidades = new ArrayList<>();
    }

    public void adicionarCidade(Cidade cidade) {
        cidades.add(cidade);
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public static void main(String[] args) {
        ColecaoCidades colecao = new ColecaoCidades();

        Cidade cidade1 = new Cidade(1, "São Paulo", "São Paulo", "SP", "História de São Paulo",
                "Restaurante A, Restaurante B", "Hotel X, Hotel Y", "Parque Z", "Loja M, Loja N");
        Cidade cidade2 = new Cidade(2, "Rio de Janeiro", "Rio de Janeiro", "RJ", "História do Rio de Janeiro",
                "Restaurante C, Restaurante D", "Hotel A, Hotel B", "Parque Y, Parque W", "Loja P, Loja Q");

        colecao.adicionarCidade(cidade1);
        colecao.adicionarCidade(cidade2);

        List<Cidade> listaCidades = colecao.getCidades();
        for (Cidade cidade : listaCidades) {
            System.out.println(cidade.toString());
        }
    }
}
