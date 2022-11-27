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
public class ImpostoISSImpl extends Imposto {

	public ImpostoISSImpl(Imposto proximoImposto) {
		super(proximoImposto);
	}

	@Override
	public BigDecimal calcula(Orcamento orcamento) {
		if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
			return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
		}

		return proximoImposto.calcula(orcamento);
	}

}
