package br.com.estudandoemcasa.servico.impl;

import java.math.BigDecimal;

import br.com.estudandoemcasa.enums.TipoImposto;
import br.com.estudandoemcasa.modelo.Orcamento;
import br.com.estudandoemcasa.servico.CalculoImposto;
import br.com.estudandoemcasa.servico.interfaces.Imposto;

public class ImpostoIcmsImpl implements Imposto {
	
private TipoImposto imposto;
	
	public ImpostoIcmsImpl(TipoImposto imposto) {
		super();
		this.imposto = imposto.ICMS;
	}

	@Override
	public BigDecimal calcula(Orcamento orcamento, TipoImposto imposto) { 
		return orcamento.getValor().multiply(new BigDecimal(4));
	}

}
