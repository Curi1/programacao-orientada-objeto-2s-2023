package atividade6;

public class DefensiveBack extends Jogador {
    private int interceptações;

    public DefensiveBack(String nome, int idade) {
        super(nome, idade);
        interceptações = 0;
    }

    public int getInterceptações() {
        return interceptações;
    }

    public void interceptarPasse() {
        interceptações++;
        System.out.println(getNome() + " interceptou um passe!");
    }
}