package br.com.estudandoemcasa.interfaces;

import java.math.BigDecimal;

import br.com.estudandoemcasa.modelo.Orcamento;

public interface Imposto { 
	
	public BigDecimal calcula(Orcamento orcamento);
}
