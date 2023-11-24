package org.example;

public class Gerente extends Funcionario {
    private String departamento;

    // Construtor
    public Gerente(String nome, String cpf, double salario, String departamento) {
        super(nome, cpf, "Gerente", salario); // 'Cargo' é fixado como "Gerente"
        this.departamento = departamento;
    }

    // Getter e Setter para departamento
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Sobrescrevendo o método exibirDetalhes
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Chama a implementação da superclasse
        System.out.println("Departamento: " + departamento);
    }

}
