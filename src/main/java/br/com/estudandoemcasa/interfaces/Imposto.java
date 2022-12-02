package br.com.estudandoemcasa.interfaces;

import java.math.BigDecimal;

import br.com.estudandoemcasa.modelo.Orcamento;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Imposto {

	protected Imposto proximoImposto;
	public BigDecimal calculadoraFinanceira(Orcamento orcamento){
		if(Boolean.TRUE.equals(aplicaDesconto(orcamento))){
			return calcula(orcamento);
		}
		return this.proximoImposto.calcula(orcamento);
	}
	protected abstract BigDecimal calcula(Orcamento orcamento);
	protected abstract Boolean aplicaDesconto(Orcamento orcamento);
}
