package atividade3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorEstoque gerenciador = new GerenciadorEstoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Gerenciamento de Estoque =====");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Atualizar Quantidade");
            System.out.println("4. Listar Produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    gerenciador.adicionarProduto(nomeProduto, quantidade);
                    break;

                case 2:
                    System.out.print("Nome do Produto: ");
                    String nomeRemover = scanner.nextLine();
                    gerenciador.removerProduto(nomeRemover);
                    break;

                case 3:
                    System.out.print("Nome do Produto: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Nova Quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    gerenciador.atualizarQuantidade(nomeAtualizar, novaQuantidade);
                    break;

                case 4:
                    gerenciador.listarProdutos();
                    break;

                case 5:
                    System.out.println("Saindo do sistema.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
                    break;
            }
        }
    }
}