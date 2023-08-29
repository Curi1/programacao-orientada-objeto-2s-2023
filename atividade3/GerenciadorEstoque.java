package atividade3;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEstoque {
    private List<Produto> estoque;

    public GerenciadorEstoque() {
        estoque = new ArrayList<>();
    }

    public void adicionarProduto(String nome, int quantidade) {
        estoque.add(new Produto(nome, quantidade));
        System.out.println("Produto adicionado ao estoque.");
    }

    public void removerProduto(String nome) {
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                estoque.remove(produto);
                System.out.println("Produto removido do estoque.");
                return;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
    }

    public void atualizarQuantidade(String nome, int novaQuantidade) {
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setQuantidade(novaQuantidade);
                System.out.println("Quantidade atualizada.");
                return;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
    }

    public void listarProdutos() {
        for (Produto produto : estoque) {
            System.out.println(produto);
        }
    }
}
