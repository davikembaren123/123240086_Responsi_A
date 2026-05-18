/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import controller.AuthController;
import javax.swing.JPasswordField;

/**
 *
 * @author Lab Informatika
 */
public class RegisterFrame extends javax.JFrame{
    public RegisterFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String nl = JTextField1.getText() ,un = jTextField2.getText(), pw = new String(JPasswordField1.getPassword());
    
    if (new AuthController().register(nl,un,pw)) {
        new LoginFrame().setVisible(true); 
        this.dispose();}
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        new LoginFrame().setVisible(true);
        this.dispose();
    }
}
