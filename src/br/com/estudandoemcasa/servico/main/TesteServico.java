package br.com.estudandoemcasa.servico.main;

import java.math.BigDecimal;

import br.com.estudandoemcasa.modelo.Orcamento;
import br.com.estudandoemcasa.servico.CalculoImposto;
import br.com.estudandoemcasa.servico.impl.ImpostoICMSImpl;
import br.com.estudandoemcasa.servico.impl.ImpostoISSImpl;

public class TesteServico {

	public static void main(String[] args) {
		
		
		Orcamento orcamento = new Orcamento(new BigDecimal("10"));
		CalculoImposto calculoImposto = new CalculoImposto();
		System.out.println(calculoImposto.calcula(orcamento, new ImpostoISSImpl()));
		
	};
}
