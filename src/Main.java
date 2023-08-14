import br.com.gulliver.beans.Cidade;
import br.com.gulliver.beans.Cliente;
import br.com.gulliver.beans.Restaurante;

public class Main {

    public static void main(String[] args) {
        Cidade objCidade = new Cidade(2, "Belo Horizonte", "Minas Gerais", "BH", "Cidade de Minas Gerais");

        Restaurante objRestaurante = new Restaurante(1, "Restaurante 1", "10:00 às 22:00", "R$ 50,00", "Centro", "Brasileira", true, "Restaurante 1");

        Cliente objCliente = new Cliente(1, "Francisco");
        
        System.out.println(objCidade.toString());
        System.out.println(objRestaurante.toString());
        System.out.println(objCliente.toString());
    }
}
