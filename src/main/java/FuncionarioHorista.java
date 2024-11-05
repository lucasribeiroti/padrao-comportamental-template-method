package src.main.java;

public class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioHorista(String nome, int id, double horasTrabalhadas, double valorPorHora) {
        super(nome, id);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    protected double calcularSalarioBase() {
        return horasTrabalhadas * valorPorHora;
    }

    @Override
    protected double calcularBonus() {
        return 0;
    }
}
