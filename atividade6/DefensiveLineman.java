package atividade6;

public class DefensiveLineman extends Jogador {
    private int tackles;

    public DefensiveLineman(String nome, int idade) {
        super(nome, idade);
        tackles = 0;
    }

    public int getTackles() {
        return tackles;
    }

    public void realizarTackle() {
        tackles++;
        System.out.println(getNome() + " realizou um tackle!");
    }
}