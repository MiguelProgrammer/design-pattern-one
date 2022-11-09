package br.com.estudandoemcasa.servico.interfaces;

import java.math.BigDecimal;

import br.com.estudandoemcasa.enums.TipoImposto;
import br.com.estudandoemcasa.modelo.Orcamento;

public interface Imposto { 
	
	BigDecimal calcula(Orcamento orcamento, TipoImposto imposto); 
}
