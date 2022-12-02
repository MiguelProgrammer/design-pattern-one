package br.com.estudandoemcasa.interfaces;

import java.math.BigDecimal;

import br.com.estudandoemcasa.modelo.Orcamento;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Imposto {
	protected Imposto proximoImposto;
	public BigDecimal calculadoraFinanceira(Orcamento orcamento){
		return Boolean.TRUE.equals(aplicaDesconto(orcamento))
				? calcula(orcamento) : this.proximoImposto.calcula(orcamento);
	}
	protected abstract BigDecimal calcula(Orcamento orcamento);
	protected abstract Boolean aplicaDesconto(Orcamento orcamento);
}
