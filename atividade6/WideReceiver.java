package atividade6;

public class WideReceiver extends Jogador {
    private int recepções;

    public WideReceiver(String nome, int idade) {
        super(nome, idade);
        recepções = 0;
    }

    public int getRecepções() {
        return recepções;
    }

    public void receberPasse() {
        recepções++;
        System.out.println(getNome() + " fez uma recepção!");
    }
}