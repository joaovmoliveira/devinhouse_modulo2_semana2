package br.com.devinhouse.exercicio.vendedor;

public class Vendedor {
    private String nome;
    private String sobrenome;
    private double valorVendidoNoMes;
    private double salarioBase;
    public Vendedor () {
    }
    public Vendedor (String nome, String sobrenome, double salarioBase) {
        if (nome == null || nome.isBlank()) {
            this.nome = "Não informado";
        }
        if (sobrenome == null || sobrenome.isBlank()) {
            this.sobrenome = "Não informado";
        }
        if (salarioBase < 0) {
            this.salarioBase = 0;
        }
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioBase = salarioBase;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobreNome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public double getValorVendidoNoMes() {
        return valorVendidoNoMes;
    }
    public void setValorVendidoNoMes(double valorVendidoNoMes) {
        this.valorVendidoNoMes = valorVendidoNoMes;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double getSalario() {
        return salarioBase;
    }
    @Override
    public String toString () {
        return String.format("O vendedor se chama %s %s, tem um salário de %.2f" +
                " e vendeu neste mês %.2f", nome, sobrenome, getSalario(), valorVendidoNoMes);
    }
}