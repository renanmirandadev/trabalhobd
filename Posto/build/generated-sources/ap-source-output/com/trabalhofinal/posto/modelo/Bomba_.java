package com.trabalhofinal.posto.modelo;

import com.trabalhofinal.posto.modelo.Combustivel;
import com.trabalhofinal.posto.modelo.Frentista_1;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-02T16:24:35")
@StaticMetamodel(Bomba.class)
public class Bomba_ { 

    public static volatile SingularAttribute<Bomba, Integer> codigo;
    public static volatile SingularAttribute<Bomba, Combustivel> combustivelcodigo;
    public static volatile CollectionAttribute<Bomba, Frentista_1> frentistaCollection;

}