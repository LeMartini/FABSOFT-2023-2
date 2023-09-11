package br.edu.univille.projlogistica2023.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idBem;

    public int getIdBem() {
        return idBem;
    }

    public void setIdBem(int idBem) {
        this.idBem = idBem;
    }

    private String tpBem;

    public String getTpBem() {
        return tpBem;
    }

    public void setTpBem(String tpBem) {
        this.tpBem = tpBem;
    }

    private String nmMarca;

    public String getNmMarca() {
        return nmMarca;
    }

    public void setNmMarca(String nmMarca) {
        this.nmMarca = nmMarca;
    }

    private String nmModelo;

    public String getNmModelo() {
        return nmModelo;
    }

    public void setNmModelo(String nmModelo) {
        this.nmModelo = nmModelo;
    }

    private String nmItem;

    public String getNmItem() {
        return nmItem;
    }

    public void setNmItem(String nmItem) {
        this.nmItem = nmItem;
    }

    private String estadoConservscao;

    public String getEstadoConservscao() {
        return estadoConservscao;
    }

    public void setEstadoConservscao(String estadoConservscao) {
        this.estadoConservscao = estadoConservscao;
    }

    private String localInicial;

    public String getLocalInicial() {
        return localInicial;
    }

    public void setLocalInicial(String localInicial) {
        this.localInicial = localInicial;
    }

    private String localAtual;

    public String getLocalAtual() {
        return localAtual;
    }

    public void setLocalAtual(String localAtual) {
        this.localAtual = localAtual;
    }

    private String formaAquisicao;

    public String getFormaAquisicao() {
        return formaAquisicao;
    }

    public void setFormaAquisicao(String formaAquisicao) {
        this.formaAquisicao = formaAquisicao;
    }

    private Date dtDepreciacao;

    public Date getDtDepreciacao() {
        return dtDepreciacao;
    }

    public void setDtDepreciacao(Date dtDepreciacao) {
        this.dtDepreciacao = dtDepreciacao;
    }

    private String percentualDepreciacao;

    public String getPercentualDepreciacao() {
        return percentualDepreciacao;
    }

    public void setPercentualDepreciacao(String percentualDepreciacao) {
        this.percentualDepreciacao = percentualDepreciacao;
    }

    private String situacaoBem;

    public String getSituacaoBem() {
        return situacaoBem;
    }

    public void setSituacaoBem(String situacaoBem) {
        this.situacaoBem = situacaoBem;
    }

}
