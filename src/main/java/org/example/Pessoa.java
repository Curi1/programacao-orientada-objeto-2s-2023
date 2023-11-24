package org.example;

public abstract class Pessoa {
    private String nome;
    private String cpf; // Identificador único para cada pessoa

    // Construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método abstrato que pode ser implementado de maneira diferente nas subclasses
    public abstract void exibirDetalhes();
}
