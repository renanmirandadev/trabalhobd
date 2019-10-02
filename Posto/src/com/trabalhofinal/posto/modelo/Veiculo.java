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
@Table(name = "veiculo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Veiculo.findAll", query = "SELECT v FROM Veiculo v")
    , @NamedQuery(name = "Veiculo.findByCodigo", query = "SELECT v FROM Veiculo v WHERE v.veiculoPK.codigo = :codigo")
    , @NamedQuery(name = "Veiculo.findByPlaca", query = "SELECT v FROM Veiculo v WHERE v.placa = :placa")
    , @NamedQuery(name = "Veiculo.findByModelo", query = "SELECT v FROM Veiculo v WHERE v.modelo = :modelo")
    , @NamedQuery(name = "Veiculo.findByMarca", query = "SELECT v FROM Veiculo v WHERE v.marca = :marca")
    , @NamedQuery(name = "Veiculo.findByCombustivelcodigo", query = "SELECT v FROM Veiculo v WHERE v.veiculoPK.combustivelcodigo = :combustivelcodigo")})
public class Veiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VeiculoPK veiculoPK;
    @Basic(optional = false)
    @Column(name = "placa")
    private int placa;
    @Basic(optional = false)
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @Column(name = "marca")
    private String marca;
    @JoinColumn(name = "Combustivel_codigo", referencedColumnName = "codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Combustivel combustivel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "veiculocodigo")
    private Collection<Cliente> clienteCollection;

    public Veiculo() {
    }

    public Veiculo(VeiculoPK veiculoPK) {
        this.veiculoPK = veiculoPK;
    }

    public Veiculo(VeiculoPK veiculoPK, int placa, String modelo, String marca) {
        this.veiculoPK = veiculoPK;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Veiculo(int codigo, int combustivelcodigo) {
        this.veiculoPK = new VeiculoPK(codigo, combustivelcodigo);
    }

    public VeiculoPK getVeiculoPK() {
        return veiculoPK;
    }

    public void setVeiculoPK(VeiculoPK veiculoPK) {
        this.veiculoPK = veiculoPK;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    @XmlTransient
    public Collection<Cliente> getClienteCollection() {
        return clienteCollection;
    }

    public void setClienteCollection(Collection<Cliente> clienteCollection) {
        this.clienteCollection = clienteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (veiculoPK != null ? veiculoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.veiculoPK == null && other.veiculoPK != null) || (this.veiculoPK != null && !this.veiculoPK.equals(other.veiculoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trabalhofinal.posto.modelo.Veiculo[ veiculoPK=" + veiculoPK + " ]";
    }
    
}
