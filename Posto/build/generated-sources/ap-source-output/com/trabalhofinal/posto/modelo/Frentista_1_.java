package com.trabalhofinal.posto.modelo;

import com.trabalhofinal.posto.modelo.Bomba;
import com.trabalhofinal.posto.modelo.FrentistaPK;
import com.trabalhofinal.posto.modelo.PostoGasolina;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-02T16:24:35")
@StaticMetamodel(Frentista_1.class)
public class Frentista_1_ { 

    public static volatile SingularAttribute<Frentista_1, Bomba> bomba;
    public static volatile SingularAttribute<Frentista_1, Long> salario;
    public static volatile SingularAttribute<Frentista_1, Integer> cpf;
    public static volatile CollectionAttribute<Frentista_1, PostoGasolina> postoGasolinaCollection;
    public static volatile SingularAttribute<Frentista_1, String> nome;
    public static volatile SingularAttribute<Frentista_1, FrentistaPK> frentistaPK;

}