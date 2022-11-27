package br.com.estudandoemcasa.interfaces.impl;

import java.math.BigDecimal;

import br.com.estudandoemcasa.interfaces.Imposto;
import br.com.estudandoemcasa.modelo.Orcamento;

class ImpostoICMSImpl implements Imposto {
	
	public ImpostoICMSImpl() {
	}

	@Override
	public BigDecimal calcula(Orcamento orcamento) { 
		return orcamento.getValor().multiply(new BigDecimal(4));
	}

}
