package br.uninove.iatechtools.pojo;

import java.io.Serializable;
import java.util.Date;

public class Nota implements Serializable {
    private int idNota;
    private String titulo;
    private String texto;
    private Date dataCriacao;

    public Nota(int idNota, String titulo, String texto, Date dataCriacao) {
        this.idNota = idNota;
        this.titulo = titulo;
        this.texto = texto;
        this.dataCriacao = dataCriacao;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}