package br.com.estudandoemcasa.servico.impl;

import java.math.BigDecimal;

import br.com.estudandoemcasa.modelo.Orcamento;
import br.com.estudandoemcasa.servico.interfaces.Imposto;

public class ImpostoICMSImpl implements Imposto { 
	
	public ImpostoICMSImpl() {
	}

	@Override
	public BigDecimal calcula(Orcamento orcamento) { 
		return orcamento.getValor().multiply(new BigDecimal(4));
	}

}
