package br.com.estudandoemcasa.servico;

import java.math.BigDecimal;

import br.com.estudandoemcasa.modelo.Orcamento;
import br.com.estudandoemcasa.servico.interfaces.Imposto;

public class CalculoImposto  { 
	
	public CalculoImposto() { 
	}

	public BigDecimal calcula(Orcamento orcamento, Imposto imposto) {
		return imposto.calcula(orcamento);
	}	
}
