package br.com.gulliver.beans;

public class Cliente {
    private Integer id;
    private String email;
    private String nome;
    private String telefone;
    private String restaurantes_visitados;
    private String comentarios;
    private String ranking;
    private String indicacoes;

    public Cliente() {

    }

    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Cliente(Integer id, String email, String nome, String telefone, String restaurantes_visitados, String comentarios, String ranking, String indicacoes) {
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
        this.restaurantes_visitados = restaurantes_visitados;
        this.comentarios = comentarios;
        this.ranking = ranking;
        this.indicacoes = indicacoes;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRestaurantes_visitados() {
        return this.restaurantes_visitados;
    }

    public void setRestaurantes_visitados(String restaurantes_visitados) {
        this.restaurantes_visitados = restaurantes_visitados;
    }

    public String getComentarios() {
        return this.comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getRanking() {
        return this.ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String getIndicacoes() {
        return this.indicacoes;
    }

    public void setIndicacoes(String indicacoes) {
        this.indicacoes = indicacoes;
    }

    public String toString() {
        return "ID: " + getId() + "\nNome: " + getNome() + "\n";
    }

}
