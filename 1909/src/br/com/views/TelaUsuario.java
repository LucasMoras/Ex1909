package br.com.views;

import java.sql.*;
import br.com.DAO.ConexaoDAO;
import br.com.DAO.UsuarioDAO;
import br.com.DTO.UsuarioDTO;

public class TelaUsuario extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaUsuario() {
        initComponents();
        conexao = ConexaoDAO.conector();
        UsuarioDAO ojbUsuarioDAO = new UsuarioDAO();
        ojbUsuarioDAO.pesquisaAuto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdUsu = new javax.swing.JTextField();
        txtNomeUsu = new javax.swing.JTextField();
        txtLoginUsu = new javax.swing.JTextField();
        txtSenhaUsu = new javax.swing.JTextField();
        cboPerfilUsu = new javax.swing.JComboBox<>();
        btnUsuCreate = new javax.swing.JButton();
        btnUsuread = new javax.swing.JButton();
        btnUsuUpdate = new javax.swing.JButton();
        btnUsuDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbUsuarios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuários");
        setPreferredSize(new java.awt.Dimension(604, 500));

        jLabel1.setText("ID");

        jLabel2.setText("Nome");

        jLabel3.setText("Login");

        jLabel4.setText("Senha");

        jLabel5.setText("Perfil");

        txtIdUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdUsuActionPerformed(evt);
            }
        });

        txtLoginUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginUsuActionPerformed(evt);
            }
        });

        cboPerfilUsu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user" }));

        btnUsuCreate.setText("Criar");
        btnUsuCreate.setToolTipText("Adicionar");
        btnUsuCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuCreate.setPreferredSize(new java.awt.Dimension(80, 80));
        btnUsuCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuCreateActionPerformed(evt);
            }
        });

        btnUsuread.setText("Pesquisar");
        btnUsuread.setToolTipText("Pesquisar");
        btnUsuread.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsureadActionPerformed(evt);
            }
        });

        btnUsuUpdate.setText("Editar");
        btnUsuUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuUpdateActionPerformed(evt);
            }
        });

        btnUsuDelete.setText("Excluir");
        btnUsuDelete.setToolTipText("Excluir");
        btnUsuDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuDeleteActionPerformed(evt);
            }
        });

        TbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Login", "Senha", "Perfil"
            }
        ));
        TbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TbUsuarios);

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboPerfilUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLoginUsu, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(txtSenhaUsu)
                    .addComponent(txtNomeUsu))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnUsuCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUsuread, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUsuUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUsuDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboPerfilUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoginUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenhaUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnUsuCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnUsuread, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(btnUsuUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 391, 497);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdUsuActionPerformed
        
    }//GEN-LAST:event_txtIdUsuActionPerformed

    private void txtLoginUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginUsuActionPerformed
        
    }//GEN-LAST:event_txtLoginUsuActionPerformed

    private void btnUsuCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuCreateActionPerformed
        
        int id_usuario = Integer.parseInt(txtIdUsu.getText());
        String nome_usuario = txtNomeUsu.getText();
        String login_usuario = txtLoginUsu.getText();
        String senha_usuario = txtSenhaUsu.getText();
        String perfil_usuario = cboPerfilUsu.getSelectedItem().toString();

        UsuarioDTO objusuarioDTO = new UsuarioDTO();
        objusuarioDTO.setId_uauario(id_usuario);
        objusuarioDTO.setNome_usuario(nome_usuario);
        objusuarioDTO.setLogin_usuario(login_usuario);
        objusuarioDTO.setSenha_usuario(senha_usuario);
        objusuarioDTO.setPerfil_usuario(perfil_usuario);

        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        objUsuarioDAO.inserirUsuario(objusuarioDTO);
        
    }//GEN-LAST:event_btnUsuCreateActionPerformed

    private void btnUsuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuDeleteActionPerformed

        int id_usuario = Integer.parseInt(txtIdUsu.getText());
        UsuarioDTO objusuarioDTO = new UsuarioDTO();
        objusuarioDTO.setId_uauario(id_usuario);
        
        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        objUsuarioDAO.deletar(objusuarioDTO);
    }//GEN-LAST:event_btnUsuDeleteActionPerformed

    private void btnUsureadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsureadActionPerformed

        int id_usuario = Integer.parseInt(txtIdUsu.getText());
        String nome_usuario = txtNomeUsu.getText();
        String login_usuario = txtLoginUsu.getText();
        String senha_usuario = txtSenhaUsu.getText();
        String perfil_usuario = cboPerfilUsu.getSelectedItem().toString();

        UsuarioDTO objusuarioDTO = new UsuarioDTO();
        objusuarioDTO.setId_uauario(id_usuario);
        objusuarioDTO.setNome_usuario(nome_usuario);
        objusuarioDTO.setLogin_usuario(login_usuario);
        objusuarioDTO.setSenha_usuario(senha_usuario);
        objusuarioDTO.setPerfil_usuario(perfil_usuario);

        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        objUsuarioDAO.pesquisar(objusuarioDTO);
        
    }//GEN-LAST:event_btnUsureadActionPerformed

    private void btnUsuUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuUpdateActionPerformed

        int id_usuario = Integer.parseInt(txtIdUsu.getText());
        String nome_usuario = txtNomeUsu.getText();
        String login_usuario = txtLoginUsu.getText();
        String senha_usuario = txtSenhaUsu.getText();
        String perfil_usuario = cboPerfilUsu.getSelectedItem().toString();

        UsuarioDTO objusuarioDTO = new UsuarioDTO();
        objusuarioDTO.setId_uauario(id_usuario);
        objusuarioDTO.setNome_usuario(nome_usuario);
        objusuarioDTO.setLogin_usuario(login_usuario);
        objusuarioDTO.setSenha_usuario(senha_usuario);
        objusuarioDTO.setPerfil_usuario(perfil_usuario);

        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        objUsuarioDAO.editar(objusuarioDTO);
        
    }//GEN-LAST:event_btnUsuUpdateActionPerformed

    private void TbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbUsuariosMouseClicked

        int linhaSel = TbUsuarios.getSelectedRow();
        if(linhaSel != -1 ){
            String id_usuario = TbUsuarios.getValueAt(linhaSel, 0).toString();
            String nome_usuario = TbUsuarios.getValueAt(linhaSel, 1).toString();
            String login_usuario = TbUsuarios.getValueAt(linhaSel, 2).toString();
            String senha_usuario = TbUsuarios.getValueAt(linhaSel, 3).toString();
            String perfil_usuario = TbUsuarios.getValueAt(linhaSel, 4).toString();
            
            txtIdUsu.setText(id_usuario);
            txtNomeUsu.setText(nome_usuario);
            txtLoginUsu.setText(login_usuario);
            txtSenhaUsu.setText(senha_usuario);
            cboPerfilUsu.setSelectedItem(perfil_usuario);
        }
    }//GEN-LAST:event_TbUsuariosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Botão limpar campos
        UsuarioDAO objusuarioDAO = new UsuarioDAO();
        objusuarioDAO.limparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TbUsuarios;
    private javax.swing.JButton btnUsuCreate;
    private javax.swing.JButton btnUsuDelete;
    private javax.swing.JButton btnUsuUpdate;
    private javax.swing.JButton btnUsuread;
    public static javax.swing.JComboBox<String> cboPerfilUsu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField txtIdUsu;
    public static javax.swing.JTextField txtLoginUsu;
    public static javax.swing.JTextField txtNomeUsu;
    public static javax.swing.JTextField txtSenhaUsu;
    // End of variables declaration//GEN-END:variables
}
