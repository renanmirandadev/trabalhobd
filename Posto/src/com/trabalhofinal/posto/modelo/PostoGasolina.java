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
@Table(name = "posto_ gasolina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PostoGasolina.findAll", query = "SELECT p FROM PostoGasolina p")
    , @NamedQuery(name = "PostoGasolina.findByCodigo", query = "SELECT p FROM PostoGasolina p WHERE p.postoGasolinaPK.codigo = :codigo")
    , @NamedQuery(name = "PostoGasolina.findByNome", query = "SELECT p FROM PostoGasolina p WHERE p.nome = :nome")
    , @NamedQuery(name = "PostoGasolina.findByTelefone", query = "SELECT p FROM PostoGasolina p WHERE p.telefone = :telefone")
    , @NamedQuery(name = "PostoGasolina.findByEndereco", query = "SELECT p FROM PostoGasolina p WHERE p.endereco = :endereco")
    , @NamedQuery(name = "PostoGasolina.findByCnpj", query = "SELECT p FROM PostoGasolina p WHERE p.cnpj = :cnpj")
    , @NamedQuery(name = "PostoGasolina.findByCidadecodigo", query = "SELECT p FROM PostoGasolina p WHERE p.postoGasolinaPK.cidadecodigo = :cidadecodigo")
    , @NamedQuery(name = "PostoGasolina.findByFrentistacodigo", query = "SELECT p FROM PostoGasolina p WHERE p.postoGasolinaPK.frentistacodigo = :frentistacodigo")})
public class PostoGasolina implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PostoGasolinaPK postoGasolinaPK;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "telefone")
    private int telefone;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "CNPJ")
    private String cnpj;
    @JoinColumn(name = "Cidade_codigo", referencedColumnName = "codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cidade cidade;
    @JoinColumn(name = "Frentista_codigo", referencedColumnName = "codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Frentista_1 frentista;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postoGasolina")
    private Collection<Pagamento> pagamentoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postoGasolina1")
    private Collection<Pagamento> pagamentoCollection1;

    public PostoGasolina() {
    }

    public PostoGasolina(PostoGasolinaPK postoGasolinaPK) {
        this.postoGasolinaPK = postoGasolinaPK;
    }

    public PostoGasolina(PostoGasolinaPK postoGasolinaPK, String nome, int telefone, String endereco, String cnpj) {
        this.postoGasolinaPK = postoGasolinaPK;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    public PostoGasolina(int codigo, int cidadecodigo, int frentistacodigo) {
        this.postoGasolinaPK = new PostoGasolinaPK(codigo, cidadecodigo, frentistacodigo);
    }

    public PostoGasolinaPK getPostoGasolinaPK() {
        return postoGasolinaPK;
    }

    public void setPostoGasolinaPK(PostoGasolinaPK postoGasolinaPK) {
        this.postoGasolinaPK = postoGasolinaPK;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Frentista_1 getFrentista() {
        return frentista;
    }

    public void setFrentista(Frentista_1 frentista) {
        this.frentista = frentista;
    }

    @XmlTransient
    public Collection<Pagamento> getPagamentoCollection() {
        return pagamentoCollection;
    }

    public void setPagamentoCollection(Collection<Pagamento> pagamentoCollection) {
        this.pagamentoCollection = pagamentoCollection;
    }

    @XmlTransient
    public Collection<Pagamento> getPagamentoCollection1() {
        return pagamentoCollection1;
    }

    public void setPagamentoCollection1(Collection<Pagamento> pagamentoCollection1) {
        this.pagamentoCollection1 = pagamentoCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (postoGasolinaPK != null ? postoGasolinaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostoGasolina)) {
            return false;
        }
        PostoGasolina other = (PostoGasolina) object;
        if ((this.postoGasolinaPK == null && other.postoGasolinaPK != null) || (this.postoGasolinaPK != null && !this.postoGasolinaPK.equals(other.postoGasolinaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trabalhofinal.posto.modelo.PostoGasolina[ postoGasolinaPK=" + postoGasolinaPK + " ]";
    }
    
}
