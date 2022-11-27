package br.com.estudandoemcasa;

import java.math.BigDecimal;

import br.com.estudandoemcasa.interfaces.impl.ImpostoISSImpl;
import br.com.estudandoemcasa.modelo.Orcamento;

public class CalculoImposto  { 
	
	public CalculoImposto() {
		// TODO document why this constructor is empty
	}

	public BigDecimal calcula(Orcamento orcamento, ImpostoISSImpl imposto) {
		return imposto.calcula(orcamento);
	}	
}
