package br.com.estudandoemcasa.interfaces.impl;


import br.com.estudandoemcasa.interfaces.Imposto;
import br.com.estudandoemcasa.modelo.Orcamento;

import java.math.BigDecimal;

public class ImpostoISSImpl implements Imposto {

	public ImpostoISSImpl() {
	}

	@Override
	public BigDecimal calcula(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal(2));
	}
}
