package br.com.gulliver.beans;

public class Local {
    private Integer id;
    private String nome;
    private String estado;
    private String sigla;
    private String historia;

    public Local() {

    }

    public Local(Integer id, String nome, String estado, String sigla, String historia) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
        this.sigla = sigla;
        this.historia = historia;
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

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getHistoria() {
        return this.historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String toString() {
        return "\nid: " + getId() +
                "\nnome: " + getNome() +
                "\nestado: " + getEstado() +
                "\nsigla: " + getSigla() +
                "\nhistoria: " + getHistoria();
    }
}
