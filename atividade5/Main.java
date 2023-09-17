package atividade5;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Ford", "Fiesta", 2020);
        Moto minhaMoto = new Moto("Honda", "CBR", 2021);
        Bicicleta minhaBicicleta = new Bicicleta("Caloi", "Cross", 2019);

        meuCarro.acelerar(60);
        meuCarro.frear(20);
        meuCarro.mostrarInformacoes();

        minhaMoto.acelerar(80);
        minhaMoto.frear(30);
        minhaMoto.mostrarInformacoes();

        minhaBicicleta.acelerar(20);
        minhaBicicleta.frear(10);
        minhaBicicleta.mostrarInformacoes();
    }
}