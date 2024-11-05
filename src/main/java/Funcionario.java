package src.main.java;

public abstract class Funcionario {
    protected String nome;
    protected int id;

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public final double calcularPagamentoMensal() {
        return calcularSalarioBase() + calcularBonus();
    }

    protected abstract double calcularSalarioBase();
    protected abstract double calcularBonus();

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", pagamento mensal=" + calcularPagamentoMensal() +
                '}';
    }
}
