package com.trabalhofinal.posto.modelo;

import com.trabalhofinal.posto.modelo.Cidade;
import com.trabalhofinal.posto.modelo.Frentista_1;
import com.trabalhofinal.posto.modelo.Pagamento;
import com.trabalhofinal.posto.modelo.PostoGasolinaPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-02T16:24:35")
@StaticMetamodel(PostoGasolina.class)
public class PostoGasolina_ { 

    public static volatile SingularAttribute<PostoGasolina, Integer> telefone;
    public static volatile SingularAttribute<PostoGasolina, Cidade> cidade;
    public static volatile SingularAttribute<PostoGasolina, String> endereco;
    public static volatile CollectionAttribute<PostoGasolina, Pagamento> pagamentoCollection1;
    public static volatile SingularAttribute<PostoGasolina, String> nome;
    public static volatile SingularAttribute<PostoGasolina, PostoGasolinaPK> postoGasolinaPK;
    public static volatile SingularAttribute<PostoGasolina, String> cnpj;
    public static volatile CollectionAttribute<PostoGasolina, Pagamento> pagamentoCollection;
    public static volatile SingularAttribute<PostoGasolina, Frentista_1> frentista;

}