package atividade6;

public class Quarterback extends Jogador {
    private int passesCompletos;

    public Quarterback(String nome, int idade) {
        super(nome, idade);
        passesCompletos = 0;
    }

    public int getPassesCompletos() {
        return passesCompletos;
    }

    public void lançarPasse() {
        passesCompletos++;
        System.out.println(getNome() + " lançou um passe completo!");
    }
}
