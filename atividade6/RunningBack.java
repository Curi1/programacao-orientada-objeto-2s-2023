package atividade6;

public class RunningBack extends Jogador {
    private int jardasCorridas;

    public RunningBack(String nome, int idade) {
        super(nome, idade);
        jardasCorridas = 0;
    }

    public int getJardasCorridas() {
        return jardasCorridas;
    }

    public void correrJardas(int jardas) {
        jardasCorridas += jardas;
        System.out.println(getNome() + " correu " + jardas + " jardas!");
    }
}
