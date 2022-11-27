package br.com.estudandoemcasa.interfaces.impl;


import br.com.estudandoemcasa.interfaces.Imposto;
import br.com.estudandoemcasa.modelo.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Optional;

@Getter
@Setter
public class ImpostoNullImpl extends Imposto {

	public ImpostoNullImpl() {
		super(null);
	}
	@Override
	public BigDecimal calcula(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
}
