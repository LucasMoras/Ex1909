package Br.com.Dao;

import Br.com.DTO.UsuarioDTO;
import Br.com.view.TelaPrincipal;
import Br.com.view.TelaUsuarios;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    //Metodo Deletar
    public void DeletarUsuario(UsuarioDTO objUsuarioDTO) {
        String sql = "delete from tb_usuarios where id_usuario = ?";
        conexao = new ConexaoDao().Conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objUsuarioDTO.getId_usuario());
            int del = pst.executeUpdate();
            if (del > 0) {
                JOptionPane.showMessageDialog(null, "Usuario deletado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Metodo deletar" + e);
        }
    }

    //Metodo Pesquisar
    public void PesquisarUsuario(UsuarioDTO objUsuarioDTO) {
        String sql = " select from tb_usuarios where id_usuario = ?";
        conexao = new ConexaoDao().Conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objUsuarioDTO.getId_usuario());
            rs = pst.executeQuery();
            if (rs.next()) {
                    TelaUsuarios objTelaUsuario = new TelaUsuarios();
                    objUsuarioDTO.setLoginUsuario (objTelaUsuario.txtLoginUsuario);
                    objUsuarioDTO.setNomeUsuario (objTelaUsuario.txtNomeUsuario);
                    objUsuarioDTO.setSenhaUsuario (objTelaUsuario.txtSenhaUsuario);
            }else{
                   JOptionPane.showMessageDialog (null, "Usuario não cadastrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Metodo Editar
    public void EditarUsuario(UsuarioDTO objUsuarioDTO) {
        String sql = "update tb_usuarios set usuario = ? , login = ?, senha = ? where id_usuario = ?";
        conexao = new ConexaoDao().Conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(4, objUsuarioDTO.getId_usuario());
            pst.setString(1, objUsuarioDTO.getNomeUsuario());
            pst.setString(2, objUsuarioDTO.getLoginUsuario());
            pst.setString(3, objUsuarioDTO.getSenhaUsuario());
            int adicionado = pst.executeUpdate();

            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Usuario editado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método editar" + e);
        }
    }

    //Metodo logar
    public void logar(UsuarioDTO objUsuarioDTO) {
        String sql = "select * from tb_usuarios where login = ? and senha = ? ";
        conexao = new ConexaoDao().Conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objUsuarioDTO.getLoginUsuario());
            pst.setString(2, objUsuarioDTO.getSenhaUsuario());
            rs = pst.executeQuery();

            if (rs.next()) {
                TelaPrincipal principal = new TelaPrincipal();
                principal.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Usuario e/ou senha invalidos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tela de login" + e);
        }
    }

    //Metodo inserir
    public void inserirUsuario(UsuarioDTO objUsuarioDTO) {
        String sql = "insert into tb_usuarios(id_usuario, usuario, login, senha) values(?, ?, ?, ?)";
        conexao = new ConexaoDao().Conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objUsuarioDTO.getId_usuario());
            pst.setString(2, objUsuarioDTO.getNomeUsuario());
            pst.setString(3, objUsuarioDTO.getLoginUsuario());
            pst.setString(4, objUsuarioDTO.getSenhaUsuario());
            int adicionado = pst.executeUpdate();
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Usuario adicionado");
            }
            pst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insert Usuario" + e);
        }
    }
}
