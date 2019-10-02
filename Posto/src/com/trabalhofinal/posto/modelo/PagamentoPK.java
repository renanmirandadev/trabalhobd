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
public class PagamentoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "codigo")
    private int codigo;
    @Basic(optional = false)
    @Column(name = "Posto_ Gasolina_codigo")
    private int postoGasolinacodigo;
    @Basic(optional = false)
    @Column(name = "Posto_ Gasolina_codigo1")
    private int postoGasolinacodigo1;

    public PagamentoPK() {
    }

    public PagamentoPK(int codigo, int postoGasolinacodigo, int postoGasolinacodigo1) {
        this.codigo = codigo;
        this.postoGasolinacodigo = postoGasolinacodigo;
        this.postoGasolinacodigo1 = postoGasolinacodigo1;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPostoGasolinacodigo() {
        return postoGasolinacodigo;
    }

    public void setPostoGasolinacodigo(int postoGasolinacodigo) {
        this.postoGasolinacodigo = postoGasolinacodigo;
    }

    public int getPostoGasolinacodigo1() {
        return postoGasolinacodigo1;
    }

    public void setPostoGasolinacodigo1(int postoGasolinacodigo1) {
        this.postoGasolinacodigo1 = postoGasolinacodigo1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigo;
        hash += (int) postoGasolinacodigo;
        hash += (int) postoGasolinacodigo1;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PagamentoPK)) {
            return false;
        }
        PagamentoPK other = (PagamentoPK) object;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.postoGasolinacodigo != other.postoGasolinacodigo) {
            return false;
        }
        if (this.postoGasolinacodigo1 != other.postoGasolinacodigo1) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trabalhofinal.posto.modelo.PagamentoPK[ codigo=" + codigo + ", postoGasolinacodigo=" + postoGasolinacodigo + ", postoGasolinacodigo1=" + postoGasolinacodigo1 + " ]";
    }
    
}
