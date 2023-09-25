package atividade6;

public class Main {
  public static void main(String[] args) {
      Time timeA = new Time("Time A");
      
      Quarterback quarterback1 = new Quarterback("Quarterback 1", 30);
      RunningBack runningBack1 = new RunningBack("Running Back 1", 25);
      WideReceiver wideReceiver1 = new WideReceiver("Wide Receiver 1", 28);
      
      timeA.adicionarJogador(quarterback1);
      timeA.adicionarJogador(runningBack1);
      timeA.adicionarJogador(wideReceiver1);
      
      timeA.realizarTreinamento();
      
      quarterback1.lançarPasse();
      runningBack1.correrJardas(20);
      wideReceiver1.receberPasse();
  }
}
