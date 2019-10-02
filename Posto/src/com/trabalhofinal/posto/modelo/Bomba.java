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
@Table(name = "bomba")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bomba.findAll", query = "SELECT b FROM Bomba b")
    , @NamedQuery(name = "Bomba.findByCodigo", query = "SELECT b FROM Bomba b WHERE b.codigo = :codigo")})
public class Bomba implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @JoinColumn(name = "Combustivel_codigo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Combustivel combustivelcodigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bomba")
    private Collection<Frentista_1> frentistaCollection;

    public Bomba() {
    }

    public Bomba(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Combustivel getCombustivelcodigo() {
        return combustivelcodigo;
    }

    public void setCombustivelcodigo(Combustivel combustivelcodigo) {
        this.combustivelcodigo = combustivelcodigo;
    }

    @XmlTransient
    public Collection<Frentista_1> getFrentistaCollection() {
        return frentistaCollection;
    }

    public void setFrentistaCollection(Collection<Frentista_1> frentistaCollection) {
        this.frentistaCollection = frentistaCollection;
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
        if (!(object instanceof Bomba)) {
            return false;
        }
        Bomba other = (Bomba) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trabalhofinal.posto.modelo.Bomba[ codigo=" + codigo + " ]";
    }
    
}
