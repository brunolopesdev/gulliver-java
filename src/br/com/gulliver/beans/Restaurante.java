package br.com.gulliver.beans;
public class Restaurante {
    private Integer id;
    private String nome;
    private String horario;
    private String preco;
    private String regiao;
    private String culinaria;
    private boolean estacionamento;
    private String descricao;

    public Restaurante() {

    }

    public Restaurante(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Restaurante(Integer id, String nome, String horario, String preco, String regiao, String culinaria, boolean estacionamento, String descricao) {
        this.id = id;
        this.nome = nome;
        this.horario = horario;
        this.preco = preco;
        this.regiao = regiao;
        this.culinaria = culinaria;
        this.estacionamento = estacionamento;
        this.descricao = descricao;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getRegiao() {
        return this.regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
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
            "\nregiao: " + getRegiao() + 
            "\nculinaria: " + getCulinaria() + 
            "\nestacionamento: " + isEstacionamento() + 
            "\ndescricao: " + getDescricao();
    }
}
