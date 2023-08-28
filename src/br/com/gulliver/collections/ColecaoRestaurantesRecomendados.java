package br.com.gulliver.collections;
import br.com.gulliver.beans.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class ColecaoRestaurantesRecomendados {
    private List<Restaurante> restaurantesRecomendados;

    public ColecaoRestaurantesRecomendados() {
        restaurantesRecomendados = new ArrayList<>();
    }

    public void adicionarRestauranteRecomendado(Restaurante restaurante) {
        restaurantesRecomendados.add(restaurante);
    }

    public List<Restaurante> getRestaurantesRecomendados() {
        return restaurantesRecomendados;
    }

    public static void main(String[] args) {
        ColecaoRestaurantesRecomendados colecao = new ColecaoRestaurantesRecomendados();

        Restaurante restaurante1 = new Restaurante(1, "Restaurante A", "São Paulo", "SP", "História do Restaurante A",
                "12:00 - 22:00", "R$50 - R$100", "Brasileira", null, true, "Restaurante aconchegante com pratos tradicionais.");
        Restaurante restaurante2 = new Restaurante(2, "Restaurante B", "Rio de Janeiro", "RJ", "História do Restaurante B",
                "11:30 - 21:30", "R$80 - R$150", "Italiana", null, false, "Restaurante elegante com massas frescas.");

        colecao.adicionarRestauranteRecomendado(restaurante1);
        colecao.adicionarRestauranteRecomendado(restaurante2);

        List<Restaurante> listaRestaurantesRecomendados = colecao.getRestaurantesRecomendados();
        for (Restaurante restaurante : listaRestaurantesRecomendados) {
            System.out.println(restaurante.toString());
        }
    }
}
