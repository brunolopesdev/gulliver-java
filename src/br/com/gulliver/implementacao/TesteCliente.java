package br.com.gulliver.implementacao;

import br.com.gulliver.beans.Cliente;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente objCliente = new Cliente(1, "Francisco");

        System.out.println(objCliente.toString());
    }
}
