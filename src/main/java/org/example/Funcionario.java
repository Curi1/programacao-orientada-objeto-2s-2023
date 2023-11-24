package org.example;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    // Construtor
    public Funcionario(String nome, String cpf, String cargo, double salario) {
        super(nome, cpf); // Chama o construtor da classe Pessoa
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters e Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Implementação do método abstrato da classe Pessoa
    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }
}

