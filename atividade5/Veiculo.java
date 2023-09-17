package atividade5;

class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int velocidade;

    public Veiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidade = 0;
    }

    public void acelerar(int aumentoDeVelocidade) {
        velocidade += aumentoDeVelocidade;
        System.out.println("Acelerando para " + velocidade + " km/h");
    }

    public void frear(int reducaoDeVelocidade) {
        velocidade -= reducaoDeVelocidade;
        if (velocidade < 0) {
            velocidade = 0;
        }
        System.out.println("Freando para " + velocidade + " km/h");
    }

    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}
