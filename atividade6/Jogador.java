package atividade6;

public class Jogador {
    private String nome;
    private int idade;

    public Jogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void jogar() {
        System.out.println(nome + " está jogando futebol americano.");
    }
}
