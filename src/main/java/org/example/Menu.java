package org.example;

import java.util.Scanner;

public class Menu {

    private static FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Consultar Funcionário");
            System.out.println("3. Atualizar Funcionário");
            System.out.println("4. Excluir Funcionário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha remanescente

            switch (opcao) {
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    consultarFuncionario();
                    break;
                case 3:
                    atualizarFuncionario();
                    break;
                case 4:
                    excluirFuncionario();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private static void adicionarFuncionario() {
        System.out.println("Adicionar novo funcionário:");

        // Coletando informações do funcionário
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha após ler o número

        // Criando um objeto Funcionario
        Funcionario novoFuncionario = new Funcionario(nome, cpf, cargo, salario);

        // Adicionando o funcionário ao banco de dados
        funcionarioDAO.adicionar(novoFuncionario);

        System.out.println("Funcionário adicionado com sucesso!");
    }


    private static void consultarFuncionario() {
        System.out.println("Consultar funcionário:");

        // Coletando o CPF do funcionário a ser consultado
        System.out.print("Digite o CPF do funcionário: ");
        String cpf = scanner.nextLine().trim(); // Lê o CPF e remove espaços em branco extras

        // Buscando o funcionário no banco de dados
        Funcionario funcionario = funcionarioDAO.consultar(cpf);

        // Exibindo os detalhes do funcionário, se encontrado
        if (funcionario != null) {
            funcionario.exibirDetalhes();
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }


    private static void atualizarFuncionario() {
        System.out.println("Atualizar funcionário:");

        // Coletando o CPF do funcionário a ser atualizado
        System.out.print("Digite o CPF do funcionário: ");
        String cpf = scanner.nextLine();

        // Verificando se o funcionário existe
        Funcionario funcionario = funcionarioDAO.consultar(cpf);
        if (funcionario == null) {
            System.out.println("Funcionário não encontrado.");
            return;
        }

        // Coletando novas informações do funcionário
        System.out.print("Novo nome (deixe em branco para manter o mesmo): ");
        String nome = scanner.nextLine();
        if (!nome.isEmpty()) {
            funcionario.setNome(nome);
        }

        System.out.print("Novo cargo (deixe em branco para manter o mesmo): ");
        String cargo = scanner.nextLine();
        if (!cargo.isEmpty()) {
            funcionario.setCargo(cargo);
        }

        System.out.print("Novo salário (digite 0 para manter o mesmo): ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer do scanner
        if (salario != 0) {
            funcionario.setSalario(salario);
        }

        // Atualizando o funcionário no banco de dados
        funcionarioDAO.atualizar(funcionario);

        System.out.println("Funcionário atualizado com sucesso!");
    }


    private static void excluirFuncionario() {
        System.out.println("Excluir funcionário:");

        // Coletando o CPF do funcionário a ser excluído
        System.out.print("Digite o CPF do funcionário que deseja excluir: ");
        String cpf = scanner.nextLine();

        // Verificando se o funcionário existe
        Funcionario funcionario = funcionarioDAO.consultar(cpf);
        if (funcionario == null) {
            System.out.println("Funcionário não encontrado.");
            return;
        }

        // Confirmação de exclusão
        System.out.println("Tem certeza que deseja excluir o funcionário: " + funcionario.getNome() + " (CPF: " + cpf + ")? (sim/não)");
        String confirmacao = scanner.nextLine();

        if (confirmacao.equalsIgnoreCase("sim")) {
            // Excluindo o funcionário do banco de dados
            funcionarioDAO.excluir(cpf);
            System.out.println("Funcionário excluído com sucesso!");
        } else {
            System.out.println("Operação cancelada.");
        }
    }

}

