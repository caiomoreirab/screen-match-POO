package br.com.poo.screenmatch.modelos;

import calculadoradetempo.Classificacao;

public class Episodio extends Titulo implements Classificacao {
    private int numero;
    private String nome;
    private Series serie;
    private int totalDeVizualicoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public int getTotalDeVizualicoes() {
        return totalDeVizualicoes;
    }

    public void setTotalDeVizualicoes(int totalDeVizualicoes) {
        this.totalDeVizualicoes = totalDeVizualicoes;
    }

    @Override
    public int getClassificacao() {
        if (getTotalDeVizualicoes() > 100) {
            return 4;
        } else {
            return 2;
        }

    }
}
