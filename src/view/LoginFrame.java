/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import controller.AuthController ;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Lab Informatika
 */
public class LoginFrame extends javax.swing.JFrame{
    public LoginFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String un = JTextField1.getText() , pw = new String(JPasswordField1.getPassword());
    
    if (new AuthController().login(un,pw)) {
        new MainFrame().setVisible(true); 
        this.dispose();}
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        new RegisterFrame().setVisible(true);
        this.dispose();
    }
}
