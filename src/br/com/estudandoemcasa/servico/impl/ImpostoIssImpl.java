package br.com.estudandoemcasa.servico.impl;

import java.math.BigDecimal;

import br.com.estudandoemcasa.enums.TipoImposto;
import br.com.estudandoemcasa.modelo.Orcamento;
import br.com.estudandoemcasa.servico.CalculoImposto;
import br.com.estudandoemcasa.servico.interfaces.Imposto;

public class ImpostoIssImpl implements Imposto { 
	
	private TipoImposto imposto;
	
	public ImpostoIssImpl(TipoImposto imposto) {
		super();
		this.imposto = imposto.ISS;
	}

	@Override
	public BigDecimal calcula(Orcamento orcamento, TipoImposto imposto) { 
		return orcamento.getValor().multiply(new BigDecimal(2));
	}

}
