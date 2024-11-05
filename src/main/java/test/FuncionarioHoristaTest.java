package src.main.java.test;

import org.junit.jupiter.api.Test;
import src.main.java.FuncionarioHorista;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioHoristaTest {

    @Test
    void deveCalcularPagamentoMensal() {
        FuncionarioHorista funcionario = new FuncionarioHorista("Maria", 101, 160, 25);
        assertEquals(4000.0, funcionario.calcularPagamentoMensal());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioHorista funcionario = new FuncionarioHorista("Maria", 101, 160, 25);
        assertEquals("Funcionario{nome='Maria', id=101, pagamento mensal=4000.0}", funcionario.toString());
    }
}