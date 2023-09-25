package atividade6;

import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<Jogador> jogadores;

    public Time(String nome) {
        this.nome = nome;
        jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void realizarTreinamento() {
        System.out.println("O time " + nome + " está realizando um treinamento de futebol americano.");
        for (Jogador jogador : jogadores) {
            jogador.jogar();
        }
    }
}
