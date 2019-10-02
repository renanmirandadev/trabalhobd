package com.trabalhofinal.posto.modelo;

import com.trabalhofinal.posto.modelo.PagamentoPK;
import com.trabalhofinal.posto.modelo.PostoGasolina;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-02T16:24:35")
@StaticMetamodel(Pagamento.class)
public class Pagamento_ { 

    public static volatile SingularAttribute<Pagamento, PagamentoPK> pagamentoPK;
    public static volatile SingularAttribute<Pagamento, PostoGasolina> postoGasolina;
    public static volatile SingularAttribute<Pagamento, Long> valor;
    public static volatile SingularAttribute<Pagamento, PostoGasolina> postoGasolina1;
    public static volatile SingularAttribute<Pagamento, Date> dPagamento;
    public static volatile SingularAttribute<Pagamento, Long> aVista;

}