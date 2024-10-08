
package Br.com.Dao;

import Br.com.DTO.UsuarioDTO;
import Br.com.view.TelaUsuarios;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;       
    
    public void inserirUsuario(UsuarioDTO objUsuarioDTO){       
       String sql = "insert into tb_usuarios(id_usuario, usuario, login, senha) values(?, ?, ?, ?)";
       conexao = new ConexaoDao().Conector();
       
       try{          
           pst = conexao.prepareStatement(sql);
           pst.setInt(1, objUsuarioDTO.getId_usuario());
           pst.setString(2, objUsuarioDTO.getNomeUsuario());
           pst.setString(3, objUsuarioDTO.getLoginUsuario());
           pst.setString(4, objUsuarioDTO.getSenhaUsuario());      
           int adicionado = pst.executeUpdate();
           if(adicionado > 0){              
             JOptionPane.showMessageDialog(null, "Usuario adicionado");             
           }          
           pst.close();           
       }catch(Exception e){           
           JOptionPane.showMessageDialog(null, "Insert Usuario" + e);           
       }    
    }   
}
