package br.com.estudandoemcasa.interfaces;

import java.math.BigDecimal;

import br.com.estudandoemcasa.modelo.Orcamento;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Imposto {

	protected Imposto proximoImposto;
	public abstract BigDecimal calcula(Orcamento orcamento);
}
