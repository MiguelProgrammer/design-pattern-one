package br.com.estudandoemcasa;

import br.com.estudandoemcasa.modelo.Orcamento;
import lombok.Getter;
import lombok.extern.java.Log;

import java.math.BigDecimal;

@Log
@Getter
public class TesteServico {
    public static void main(String[] args) {

        CalculoImposto calculoImposto = new CalculoImposto();
        log.info("Result: " + calculoImposto.calcula(new Orcamento(new BigDecimal("500"))));
    }
}
