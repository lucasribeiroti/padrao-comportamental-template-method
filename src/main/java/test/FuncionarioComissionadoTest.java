package src.main.java.test;

import org.junit.jupiter.api.Test;
import src.main.java.FuncionarioComissionado;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComissionadoTest {

    @Test
    void deveCalcularPagamentoMensal() {
        FuncionarioComissionado funcionario = new FuncionarioComissionado("João", 102, 5000, 0.1);
        assertEquals(500.0, funcionario.calcularPagamentoMensal());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioComissionado funcionario = new FuncionarioComissionado("João", 102, 5000, 0.1);
        assertEquals("Funcionario{nome='João', id=102, pagamento mensal=500.0}", funcionario.toString());
    }
}