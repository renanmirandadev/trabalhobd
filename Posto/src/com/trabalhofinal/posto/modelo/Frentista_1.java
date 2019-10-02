/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhofinal.posto.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Renan
 */
@Entity
@Table(name = "frentista")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Frentista_1.findAll", query = "SELECT f FROM Frentista_1 f")
    , @NamedQuery(name = "Frentista_1.findByCodigo", query = "SELECT f FROM Frentista_1 f WHERE f.frentistaPK.codigo = :codigo")
    , @NamedQuery(name = "Frentista_1.findByNome", query = "SELECT f FROM Frentista_1 f WHERE f.nome = :nome")
    , @NamedQuery(name = "Frentista_1.findBySalario", query = "SELECT f FROM Frentista_1 f WHERE f.salario = :salario")
    , @NamedQuery(name = "Frentista_1.findByCpf", query = "SELECT f FROM Frentista_1 f WHERE f.cpf = :cpf")
    , @NamedQuery(name = "Frentista_1.findByBombacodigo", query = "SELECT f FROM Frentista_1 f WHERE f.frentistaPK.bombacodigo = :bombacodigo")})
public class Frentista_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FrentistaPK frentistaPK;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "salario")
    private long salario;
    @Basic(optional = false)
    @Column(name = "CPF")
    private int cpf;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "frentista")
    private Collection<PostoGasolina> postoGasolinaCollection;
    @JoinColumn(name = "Bomba_codigo", referencedColumnName = "codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Bomba bomba;

    public Frentista_1() {
    }

    public Frentista_1(FrentistaPK frentistaPK) {
        this.frentistaPK = frentistaPK;
    }

    public Frentista_1(FrentistaPK frentistaPK, String nome, long salario, int cpf) {
        this.frentistaPK = frentistaPK;
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public Frentista_1(int codigo, int bombacodigo) {
        this.frentistaPK = new FrentistaPK(codigo, bombacodigo);
    }

    public FrentistaPK getFrentistaPK() {
        return frentistaPK;
    }

    public void setFrentistaPK(FrentistaPK frentistaPK) {
        this.frentistaPK = frentistaPK;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @XmlTransient
    public Collection<PostoGasolina> getPostoGasolinaCollection() {
        return postoGasolinaCollection;
    }

    public void setPostoGasolinaCollection(Collection<PostoGasolina> postoGasolinaCollection) {
        this.postoGasolinaCollection = postoGasolinaCollection;
    }

    public Bomba getBomba() {
        return bomba;
    }

    public void setBomba(Bomba bomba) {
        this.bomba = bomba;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (frentistaPK != null ? frentistaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Frentista_1)) {
            return false;
        }
        Frentista_1 other = (Frentista_1) object;
        if ((this.frentistaPK == null && other.frentistaPK != null) || (this.frentistaPK != null && !this.frentistaPK.equals(other.frentistaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trabalhofinal.posto.modelo.Frentista_1[ frentistaPK=" + frentistaPK + " ]";
    }
    
}
