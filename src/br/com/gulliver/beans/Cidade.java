package br.com.gulliver.beans;

public class Cidade {
    private Integer id;
    private String nome;
    private String estado;
    private String sigla;
    private String historia;
    private String restaurantesIndicados;
    private String hoteisIndicados;
    private String parquesIndicados;
    private String lojasIndicados;

    public Cidade() {

    }

    public Cidade(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Cidade(Integer id, String nome, String estado, String sigla, String historia, String restaurantesIndicados,
            String hoteisIndicados, String parquesIndicados, String lojasIndicados) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
        this.sigla = sigla;
        this.historia = historia;
        this.restaurantesIndicados = restaurantesIndicados;
        this.hoteisIndicados = hoteisIndicados;
        this.parquesIndicados = parquesIndicados;
        this.lojasIndicados = lojasIndicados;
    }

    public Cidade(Integer id, String nome, String estado, String sigla, String historia) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
        this.sigla = sigla;
        this.historia = historia;
    }

    // Getters e Setters (Encapsulamento)
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public void setRestaurantesIndicados(String restaurantesIndicados) {
        this.restaurantesIndicados = restaurantesIndicados;
    }

    public void setHoteisIndicados(String hoteisIndicados) {
        this.hoteisIndicados = hoteisIndicados;
    }

    public void setParquesIndicados(String parquesIndicados) {
        this.parquesIndicados = parquesIndicados;
    }

    public void setLojasIndicados(String lojasIndicados) {
        this.lojasIndicados = lojasIndicados;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public String getSigla() {
        return sigla;
    }

    public String getHistoria() {
        return historia;
    }

    public String getRestaurantesIndicados() {
        return restaurantesIndicados;
    }

    public String getHoteisIndicados() {
        return hoteisIndicados;
    }

    public String getParquesIndicados() {
        return parquesIndicados;
    }

    public String getLojasIndicados() {
        return lojasIndicados;
    }

    // @Override
    public String toString() {
        return "\nid: " + getId() +
                "\nnome: " + getNome() +
                "\nestado: " + getEstado() +
                "\nsigla: " + getSigla() +
                "\nhistoria: " + getHistoria() +
                "\nrestaurantesIndicados: " + getRestaurantesIndicados() +
                "\nhoteisIndicados: " + getHoteisIndicados() +
                "\nparquesIndicados: " + getParquesIndicados() +
                "\nlojasIndicados: " + getLojasIndicados();
    }
}
