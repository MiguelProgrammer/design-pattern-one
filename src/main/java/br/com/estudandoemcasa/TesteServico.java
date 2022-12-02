package br.com.estudandoemcasa;

import br.com.estudandoemcasa.interfaces.impl.ImpostoICMSImpl;
import br.com.estudandoemcasa.interfaces.impl.ImpostoISSImpl;
import br.com.estudandoemcasa.interfaces.impl.ImpostoNullImpl;
import br.com.estudandoemcasa.modelo.Orcamento;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class TesteServico {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("0"));
		CalculoImposto calculoImposto = new CalculoImposto();

		System.out.println(calculoImposto.calcula(orcamento));
	}
}
