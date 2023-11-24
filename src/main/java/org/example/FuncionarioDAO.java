package org.example;

import java.sql.*;

public class FuncionarioDAO {

    private String url = "jdbc:postgresql://localhost:5432/postgres"; // URL do banco de dados
    private String usuario = "postgres"; // Usuário do banco de dados
    private String senha = "admin"; // Senha do banco de dados

    // Método para obter a conexão com o banco de dados
    private Connection conectar() {
        Connection conexao = null;
        try {
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return conexao;
    }

    // Método para adicionar um funcionário
    public void adicionar(Funcionario funcionario) {
        String sql = "INSERT INTO funcionarios (nome, cpf, cargo, salario) VALUES (?, ?, ?, ?)";
        try (Connection conexao = conectar();
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, funcionario.getNome());
            pstmt.setString(2, funcionario.getCpf());
            pstmt.setString(3, funcionario.getCargo());
            pstmt.setDouble(4, funcionario.getSalario());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Funcionario consultar(String cpf) {
        String sql = "SELECT * FROM funcionarios WHERE cpf = ?";
        try (Connection conexao = conectar();
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, cpf);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String nome = rs.getString("nome");
                String cargo = rs.getString("cargo");
                double salario = rs.getDouble("salario");
                return new Funcionario(nome, cpf, cargo, salario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void atualizar(Funcionario funcionario) {
        String sql = "UPDATE funcionarios SET nome = ?, cargo = ?, salario = ? WHERE cpf = ?";
        try (Connection conexao = conectar();
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, funcionario.getNome());
            pstmt.setString(2, funcionario.getCargo());
            pstmt.setDouble(3, funcionario.getSalario());
            pstmt.setString(4, funcionario.getCpf());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluir(String cpf) {
        String sql = "DELETE FROM funcionarios WHERE cpf = ?";
        try (Connection conexao = conectar();
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, cpf);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
