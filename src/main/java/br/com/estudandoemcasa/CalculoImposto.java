package br.com.estudandoemcasa;

import br.com.estudandoemcasa.interfaces.Imposto;
import br.com.estudandoemcasa.interfaces.impl.ImpostoICMSImpl;
import br.com.estudandoemcasa.interfaces.impl.ImpostoISSImpl;
import br.com.estudandoemcasa.interfaces.impl.ImpostoNullImpl;
import br.com.estudandoemcasa.modelo.Orcamento;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
@AllArgsConstructor
public class CalculoImposto  {

	public BigDecimal calcula(Orcamento orcamento) {
		Imposto imp = new ImpostoISSImpl(new ImpostoICMSImpl(new ImpostoNullImpl()));
		return imp.calculadoraFinanceira(orcamento);
	}
}
