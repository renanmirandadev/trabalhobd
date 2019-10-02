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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "combustivel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Combustivel.findAll", query = "SELECT c FROM Combustivel c")
    , @NamedQuery(name = "Combustivel.findByCodigo", query = "SELECT c FROM Combustivel c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "Combustivel.findByTipo", query = "SELECT c FROM Combustivel c WHERE c.tipo = :tipo")
    , @NamedQuery(name = "Combustivel.findByValor", query = "SELECT c FROM Combustivel c WHERE c.valor = :valor")
    , @NamedQuery(name = "Combustivel.findByQtdTanque", query = "SELECT c FROM Combustivel c WHERE c.qtdTanque = :qtdTanque")})
public class Combustivel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "valor")
    private long valor;
    @Basic(optional = false)
    @Column(name = "qtd_tanque")
    private float qtdTanque;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "combustivel")
    private Collection<Veiculo> veiculoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "combustivelcodigo")
    private Collection<Bomba> bombaCollection;

    public Combustivel() {
    }

    public Combustivel(Integer codigo) {
        this.codigo = codigo;
    }

    public Combustivel(Integer codigo, String tipo, long valor, float qtdTanque) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.valor = valor;
        this.qtdTanque = qtdTanque;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public float getQtdTanque() {
        return qtdTanque;
    }

    public void setQtdTanque(float qtdTanque) {
        this.qtdTanque = qtdTanque;
    }

    @XmlTransient
    public Collection<Veiculo> getVeiculoCollection() {
        return veiculoCollection;
    }

    public void setVeiculoCollection(Collection<Veiculo> veiculoCollection) {
        this.veiculoCollection = veiculoCollection;
    }

    @XmlTransient
    public Collection<Bomba> getBombaCollection() {
        return bombaCollection;
    }

    public void setBombaCollection(Collection<Bomba> bombaCollection) {
        this.bombaCollection = bombaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Combustivel)) {
            return false;
        }
        Combustivel other = (Combustivel) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trabalhofinal.posto.modelo.Combustivel[ codigo=" + codigo + " ]";
    }
    
}
