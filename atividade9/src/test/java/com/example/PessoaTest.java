package atividade9.src.test.java.com.example;

import atividade9.src.main.java.com.example.Pessoa;
import org.junit.jupiter.api.Test;




public class PessoaTest {
    @Test
    public void testDizerOla() {
        Pessoa pessoa = new Pessoa();
        String saudacao = pessoa.dizerOla();
        equals("Olá, mundo!");
    }
}
