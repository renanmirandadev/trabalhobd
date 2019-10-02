package com.trabalhofinal.posto.modelo;

import com.trabalhofinal.posto.modelo.Bomba;
import com.trabalhofinal.posto.modelo.Veiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-02T16:24:35")
@StaticMetamodel(Combustivel.class)
public class Combustivel_ { 

    public static volatile SingularAttribute<Combustivel, Integer> codigo;
    public static volatile SingularAttribute<Combustivel, String> tipo;
    public static volatile SingularAttribute<Combustivel, Long> valor;
    public static volatile CollectionAttribute<Combustivel, Veiculo> veiculoCollection;
    public static volatile CollectionAttribute<Combustivel, Bomba> bombaCollection;
    public static volatile SingularAttribute<Combustivel, Float> qtdTanque;

}