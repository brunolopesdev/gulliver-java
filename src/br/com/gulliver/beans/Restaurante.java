package br.com.gulliver.beans;
public class Restaurante extends Local {
    private String horario;
    private String preco;
    private String culinaria;
    private boolean estacionamento;
    private String descricao;

    public Restaurante() {
        
    }

    public Restaurante(Integer id, String nome, String estado, String sigla, String historia, String horario, String preco, String regiao, String culinaria, boolean estacionamento, String descricao) {
        super(id, nome, estado, sigla, historia);
        this.horario = horario;
        this.preco = preco;
        this.culinaria = culinaria;
        this.estacionamento = estacionamento;
        this.descricao = descricao;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPreco() {
        return this.preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getCulinaria() {
        return this.culinaria;
    }

    public void setCulinaria(String culinaria) {
        this.culinaria = culinaria;
    }

    public boolean isEstacionamento() {
        return this.estacionamento;
    }

    public boolean getEstacionamento() {
        return this.estacionamento;
    }

    public void setEstacionamento(boolean estacionamento) {
        this.estacionamento = estacionamento;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String toString() {
        return 
            "\nid: " + getId() + 
            "\nnome: " + getNome() + 
            "\nhorario: " + getHorario() + 
            "\npreco: " + getPreco() +
            "\nculinaria: " + getCulinaria() + 
            "\nestacionamento: " + isEstacionamento() + 
            "\ndescricao: " + getDescricao();
    }
}
