/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 * Modelo de la clase noticas
 *
 * @author ck
 */
public class NoticiasNasa implements Serializable {

    private static final long serialVersionUID = 1L;
    @JsonProperty("date")
    private String fecha;
    @JsonProperty("explanation")
    private String explanation;
    @JsonProperty("media_type")
    private String tipoDMedio;
    @JsonProperty("service_version")
    private String versionDelservicio;
    @JsonProperty("title")
    private String titulo;
    @JsonProperty("url")
    private String url;

    public NoticiasNasa(String fecha, String explanation, String tipoDMedio, String versionDelservicio, String titulo, String url) {
        this.fecha = fecha;
        this.explanation = explanation;
        this.tipoDMedio = tipoDMedio;
        this.versionDelservicio = versionDelservicio;
        this.titulo = titulo;
        this.url = url;
    }

    public NoticiasNasa() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getTipoDMedio() {
        return tipoDMedio;
    }

    public void setTipoDMedio(String tipoDMedio) {
        this.tipoDMedio = tipoDMedio;
    }

    public String getVersionDelservicio() {
        return versionDelservicio;
    }

    public void setVersionDelservicio(String versionDelservicio) {
        this.versionDelservicio = versionDelservicio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "NoticiasNasa{" + "fecha=" + fecha + ", explanation=" + explanation + ", tipoDMedio=" + tipoDMedio + ", versionDelservicio=" + versionDelservicio + ", titulo=" + titulo + ", url=" + url + '}';
    }
}
