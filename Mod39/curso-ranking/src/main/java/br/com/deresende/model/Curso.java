package br.com.deresende.model;

public class Curso {
    private String nome;
    private String faculdade;

    public double getNotaGeral() {
        return notaGeral;
    }

    public void setNotaGeral(double notaGeral) {
        this.notaGeral = notaGeral;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private double notaGeral;

    // Construtores, getters e setters
}