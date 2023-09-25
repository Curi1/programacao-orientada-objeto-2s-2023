package atividade6;

public class OffensiveLineman extends Jogador {
    private int bloqueios;

    public OffensiveLineman(String nome, int idade) {
        super(nome, idade);
        bloqueios = 0;
    }

    public int getBloqueios() {
        return bloqueios;
    }

    public void bloquear() {
        bloqueios++;
        System.out.println(getNome() + " fez um bloqueio!");
    }
}