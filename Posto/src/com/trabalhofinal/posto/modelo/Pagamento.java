/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhofinal.posto.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Renan
 */
@Entity
@Table(name = "pagamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagamento.findAll", query = "SELECT p FROM Pagamento p")
    , @NamedQuery(name = "Pagamento.findByCodigo", query = "SELECT p FROM Pagamento p WHERE p.pagamentoPK.codigo = :codigo")
    , @NamedQuery(name = "Pagamento.findByValor", query = "SELECT p FROM Pagamento p WHERE p.valor = :valor")
    , @NamedQuery(name = "Pagamento.findByAVista", query = "SELECT p FROM Pagamento p WHERE p.aVista = :aVista")
    , @NamedQuery(name = "Pagamento.findByDPagamento", query = "SELECT p FROM Pagamento p WHERE p.dPagamento = :dPagamento")
    , @NamedQuery(name = "Pagamento.findByPostoGasolinacodigo", query = "SELECT p FROM Pagamento p WHERE p.pagamentoPK.postoGasolinacodigo = :postoGasolinacodigo")
    , @NamedQuery(name = "Pagamento.findByPostoGasolinacodigo1", query = "SELECT p FROM Pagamento p WHERE p.pagamentoPK.postoGasolinacodigo1 = :postoGasolinacodigo1")})
public class Pagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PagamentoPK pagamentoPK;
    @Basic(optional = false)
    @Column(name = "valor")
    private long valor;
    @Basic(optional = false)
    @Column(name = "a_vista")
    private long aVista;
    @Basic(optional = false)
    @Column(name = "d_pagamento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dPagamento;
    @JoinColumn(name = "Posto_ Gasolina_codigo", referencedColumnName = "codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PostoGasolina postoGasolina;
    @JoinColumn(name = "Posto_ Gasolina_codigo1", referencedColumnName = "codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PostoGasolina postoGasolina1;

    public Pagamento() {
    }

    public Pagamento(PagamentoPK pagamentoPK) {
        this.pagamentoPK = pagamentoPK;
    }

    public Pagamento(PagamentoPK pagamentoPK, long valor, long aVista, Date dPagamento) {
        this.pagamentoPK = pagamentoPK;
        this.valor = valor;
        this.aVista = aVista;
        this.dPagamento = dPagamento;
    }

    public Pagamento(int codigo, int postoGasolinacodigo, int postoGasolinacodigo1) {
        this.pagamentoPK = new PagamentoPK(codigo, postoGasolinacodigo, postoGasolinacodigo1);
    }

    public PagamentoPK getPagamentoPK() {
        return pagamentoPK;
    }

    public void setPagamentoPK(PagamentoPK pagamentoPK) {
        this.pagamentoPK = pagamentoPK;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public long getAVista() {
        return aVista;
    }

    public void setAVista(long aVista) {
        this.aVista = aVista;
    }

    public Date getDPagamento() {
        return dPagamento;
    }

    public void setDPagamento(Date dPagamento) {
        this.dPagamento = dPagamento;
    }

    public PostoGasolina getPostoGasolina() {
        return postoGasolina;
    }

    public void setPostoGasolina(PostoGasolina postoGasolina) {
        this.postoGasolina = postoGasolina;
    }

    public PostoGasolina getPostoGasolina1() {
        return postoGasolina1;
    }

    public void setPostoGasolina1(PostoGasolina postoGasolina1) {
        this.postoGasolina1 = postoGasolina1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pagamentoPK != null ? pagamentoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagamento)) {
            return false;
        }
        Pagamento other = (Pagamento) object;
        if ((this.pagamentoPK == null && other.pagamentoPK != null) || (this.pagamentoPK != null && !this.pagamentoPK.equals(other.pagamentoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trabalhofinal.posto.modelo.Pagamento[ pagamentoPK=" + pagamentoPK + " ]";
    }
    
}
