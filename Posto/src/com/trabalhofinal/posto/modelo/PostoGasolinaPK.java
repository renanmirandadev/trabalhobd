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
public class PostoGasolinaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "codigo")
    private int codigo;
    @Basic(optional = false)
    @Column(name = "Cidade_codigo")
    private int cidadecodigo;
    @Basic(optional = false)
    @Column(name = "Frentista_codigo")
    private int frentistacodigo;

    public PostoGasolinaPK() {
    }

    public PostoGasolinaPK(int codigo, int cidadecodigo, int frentistacodigo) {
        this.codigo = codigo;
        this.cidadecodigo = cidadecodigo;
        this.frentistacodigo = frentistacodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCidadecodigo() {
        return cidadecodigo;
    }

    public void setCidadecodigo(int cidadecodigo) {
        this.cidadecodigo = cidadecodigo;
    }

    public int getFrentistacodigo() {
        return frentistacodigo;
    }

    public void setFrentistacodigo(int frentistacodigo) {
        this.frentistacodigo = frentistacodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigo;
        hash += (int) cidadecodigo;
        hash += (int) frentistacodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostoGasolinaPK)) {
            return false;
        }
        PostoGasolinaPK other = (PostoGasolinaPK) object;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.cidadecodigo != other.cidadecodigo) {
            return false;
        }
        if (this.frentistacodigo != other.frentistacodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trabalhofinal.posto.modelo.PostoGasolinaPK[ codigo=" + codigo + ", cidadecodigo=" + cidadecodigo + ", frentistacodigo=" + frentistacodigo + " ]";
    }
    
}
