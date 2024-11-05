package src.main.java;

public class FuncionarioComissionado extends Funcionario {
    private double vendasMensais;
    private double taxaComissao;

    public FuncionarioComissionado(String nome, int id, double vendasMensais, double taxaComissao) {
        super(nome, id);
        this.vendasMensais = vendasMensais;
        this.taxaComissao = taxaComissao;
    }

    @Override
    protected double calcularSalarioBase() {
        return 0;
    }

    @Override
    protected double calcularBonus() {
        return vendasMensais * taxaComissao;
    }
}
