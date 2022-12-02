package br.com.estudandoemcasa.interfaces.impl;

import br.com.estudandoemcasa.interfaces.Imposto;
import br.com.estudandoemcasa.modelo.Orcamento;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

import java.math.BigDecimal;

@Getter
@Setter
@Log
public class ImpostoICMSImpl extends Imposto {

    public ImpostoICMSImpl(Imposto proximoImposto) {
        super(proximoImposto);
    }
    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        log.info("Imposto ICMSI");
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
    }

    @Override
    public Boolean aplicaDesconto(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("400")) > 0;
    }

}
