package br.com.gulliver.beans;

public class Cidade extends Local {
    private String restaurantesIndicados;
    private String hoteisIndicados;
    private String parquesIndicados;
    private String lojasIndicados;

    public Cidade() {

    }

    public Cidade(Integer id, String nome, String estado, String sigla, String historia, String restaurantesIndicados,
            String hoteisIndicados, String parquesIndicados, String lojasIndicados) {
        super(id, nome, estado, sigla, historia);
        this.restaurantesIndicados = restaurantesIndicados;
        this.hoteisIndicados = hoteisIndicados;
        this.parquesIndicados = parquesIndicados;
        this.lojasIndicados = lojasIndicados;
    }

    public Cidade(Integer id, String nome, String estado, String sigla, String historia) {
        super(id, nome, estado, sigla, historia);
    }

    // Getters e Setters (Encapsulamento)
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
