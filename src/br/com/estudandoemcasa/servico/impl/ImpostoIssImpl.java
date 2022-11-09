package br.com.estudandoemcasa.servico.impl;

import java.math.BigDecimal;

import br.com.estudandoemcasa.modelo.Orcamento;
import br.com.estudandoemcasa.servico.interfaces.Imposto;

public class ImpostoISSImpl implements Imposto {  
	
	public ImpostoISSImpl() {
	}

	@Override
	public BigDecimal calcula(Orcamento orcamento) { 
		return orcamento.getValor().multiply(new BigDecimal(2));
	}

}
