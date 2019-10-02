package com.trabalhofinal.posto.modelo;

import com.trabalhofinal.posto.modelo.PostoGasolina;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-02T16:24:35")
@StaticMetamodel(Cidade.class)
public class Cidade_ { 

    public static volatile SingularAttribute<Cidade, Integer> codigo;
    public static volatile CollectionAttribute<Cidade, PostoGasolina> postoGasolinaCollection;
    public static volatile SingularAttribute<Cidade, String> nome;
    public static volatile SingularAttribute<Cidade, Integer> cep;

}