package com.trabalhofinal.posto.modelo;

import com.trabalhofinal.posto.modelo.Cliente;
import com.trabalhofinal.posto.modelo.Combustivel;
import com.trabalhofinal.posto.modelo.VeiculoPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-02T16:24:35")
@StaticMetamodel(Veiculo.class)
public class Veiculo_ { 

    public static volatile SingularAttribute<Veiculo, String> marca;
    public static volatile SingularAttribute<Veiculo, Combustivel> combustivel;
    public static volatile SingularAttribute<Veiculo, VeiculoPK> veiculoPK;
    public static volatile SingularAttribute<Veiculo, String> modelo;
    public static volatile SingularAttribute<Veiculo, Integer> placa;
    public static volatile CollectionAttribute<Veiculo, Cliente> clienteCollection;

}