/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.CRUB;

import Modelo.MantenimientoDao;
import Modelo.Usuario;
import Vista.Mantenimiento;
import com.placeholder.PlaceHolder;

/**
 *
 * @author Jhonas
 */
public class EditarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form EditarUsuario
     */
    
    public EditarUsuario() {
        initComponents();
        PlaceHolder holderUsuario = new PlaceHolder(CodigoUsuario, "CODIGO (autogenerado)");
        PlaceHolder holderNick = new PlaceHolder(NickName, "NOMBRE DE USUARIO");
        PlaceHolder holderNombre = new PlaceHolder(UsuarioNombre, "NOMBRE");
        PlaceHolder holderApellido = new PlaceHolder(UsuarioApellido, "APELLIDO");
        PlaceHolder holderClave = new PlaceHolder(UsuarioClave, "CLAVE");
        
        
        dao.editarUsuario(mant.usuarios, CodigoUsuario, NickName, Nivel, UsuarioApellido, UsuarioClave, UsuarioNombre);
    }
    
    MantenimientoDao dao = new MantenimientoDao();
    Mantenimiento mant = new Mantenimiento();
    //(JTable tabla, JTextField codigo2, JTextField nick2, JComboBox<String> nivel2, JTextField apellido2, JPasswordField clave2, JTextField nombre2)
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        CodigoUsuario = new javax.swing.JTextField();
        UsuarioNombre = new javax.swing.JTextField();
        UsuarioApellido = new javax.swing.JTextField();
        NickName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Nivel = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        UsuarioClave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(161, 239, 160));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CodigoUsuario.setEditable(false);
        jPanel2.add(CodigoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 200, 30));
        jPanel2.add(UsuarioNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 200, 30));
        jPanel2.add(UsuarioApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 200, 30));
        jPanel2.add(NickName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 200, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 153, 0));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/CRUD/edit-user.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setText("Nivel de Usuario:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        Nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2"}));
        Nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NivelActionPerformed(evt);
            }
        });
        jPanel4.add(Nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel1.setText("Contraseña:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 80, 20));
        jPanel4.add(UsuarioClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 200, 30));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 153, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/CRUD/salida.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel4.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 740, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void NivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NivelActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.valueOf(CodigoUsuario.getText());
        String nick = NickName.getText();
        int nivel = Nivel.getSelectedIndex()+1;
        String apellido = UsuarioApellido.getText();
        String nombre = UsuarioNombre.getText();
        String clave = UsuarioClave.getText().toString();
        //(int codigo, String nombre, String apellido, String nickName, String clave, int nivel)
        Usuario u = new Usuario(codigo, nombre, apellido, nick, clave, nivel);
        dao.actualizarUsuario(u);
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarUsuario().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CodigoUsuario;
    public javax.swing.JTextField NickName;
    public javax.swing.JComboBox<String> Nivel;
    public javax.swing.JTextField UsuarioApellido;
    public javax.swing.JPasswordField UsuarioClave;
    public javax.swing.JTextField UsuarioNombre;
    public javax.swing.JButton btnEditar;
    public static final javax.swing.JButton btnSalir = new javax.swing.JButton();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}