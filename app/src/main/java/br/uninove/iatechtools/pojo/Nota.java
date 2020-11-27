package br.uninove.iatechtools.pojo;

import java.util.Date;

public class Nota {
    private int idNota;
    private String titulo;
    private String texto;

    public Nota(int idNota, String titulo, String texto) {
        this.idNota = idNota;
        this.titulo = titulo;
        this.texto = texto;
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
}

