package JFrames;

import connection.DbaConnection;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public final class Login extends javax.swing.JFrame {

   

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("./brackgournd/icon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        LblTittle = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtUsername = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        Salir = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        LblFondo = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblTittle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LblTittle.setForeground(new java.awt.Color(255, 255, 255));
        LblTittle.setText("Bienvenido");
        getContentPane().add(LblTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 55, 137, 31));

        LblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario.setText("Usuario");
        getContentPane().add(LblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 104, 112, 28));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contrase??a");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 161, -1, -1));

        TxtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(TxtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 110, 200, 35));

        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 167, 200, 35));

        Salir.setBackground(new java.awt.Color(97, 114, 124));
        Salir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 243, 114, 50));

        loginButton.setBackground(new java.awt.Color(97, 114, 124));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Ingresar");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 243, 140, 50));

        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brackgournd/fondoEmpresa.jpg"))); // NOI18N
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 590, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        loginuser();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void jPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyTyped
        char enter = evt.getKeyChar();
        if (enter == KeyEvent.VK_ENTER) {
            loginuser();
        }
        //login=loginuser();
    }//GEN-LAST:event_jPasswordKeyTyped

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblFondo;
    private javax.swing.JLabel LblTittle;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField TxtUsername;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton loginButton;
    // End of variables declaration//GEN-END:variables
public String loginuser() {
        Connection connection = null;
        DbaConnection dbaConnection = new DbaConnection();
        String nombre = null;
        try {
            connection = dbaConnection.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        String username = TxtUsername.getText();
        String password = new String(jPassword.getPassword());
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(this, "Uno o mas campos esta vacio. Ingrese un valor  dsg");
        } else {
            try {
                ps = connection.prepareStatement("SELECT password , users, tipo,nombre FROM users where users=? and password  = ?");
                ps.setString(1, username);
                ps.setString(2, password);
                rs = ps.executeQuery();
                if (rs.next()) {
                    int tipo = rs.getInt("tipo");
                    
                    if (tipo == 1) {
                            RegistroDeUsuario registroDeUsuario ;
                        new RegistroDeUsuario().setVisible(true);
                        dispose();

                    }
                    if (tipo == 2) {
                        MainPlanilla mainPlanilla;
                        new MainPlanilla().setVisible(true);
                        dispose();
                        //return nombre;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contrase??a incorrecta");
                }
            } catch (Exception e) {

            }
        }

        return nombre;
    }

}
