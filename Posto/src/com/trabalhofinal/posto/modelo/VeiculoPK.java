/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhofinal.posto.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Renan
 */
@Embeddable
public class VeiculoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "codigo")
    private int codigo;
    @Basic(optional = false)
    @Column(name = "Combustivel_codigo")
    private int combustivelcodigo;

    public VeiculoPK() {
    }

    public VeiculoPK(int codigo, int combustivelcodigo) {
        this.codigo = codigo;
        this.combustivelcodigo = combustivelcodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCombustivelcodigo() {
        return combustivelcodigo;
    }

    public void setCombustivelcodigo(int combustivelcodigo) {
        this.combustivelcodigo = combustivelcodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigo;
        hash += (int) combustivelcodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VeiculoPK)) {
            return false;
        }
        VeiculoPK other = (VeiculoPK) object;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.combustivelcodigo != other.combustivelcodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trabalhofinal.posto.modelo.VeiculoPK[ codigo=" + codigo + ", combustivelcodigo=" + combustivelcodigo + " ]";
    }
    
}
