/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import controller.ItemController;

/**
 *
 * @author Lab Informatika
 */
public class MainFrame extends javax.swing.JFrame{
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        loadData();
    }
    
    public void loadData() {
        DefaultTableModel model = (DefaultTableModel) tabelKamar.getModel();
        model.setRowCount(0);
        try (ResultSet rs = new ItemController().getAllItems()){
            while (rs != null && rs.next()) {
                String name = rs.getString(:"name") != null ? rs.getString("name");
                String duration = rs.getString("duration") != null ? rs.getString("duration");
                model.addRow(new Object[]{rss.getInt("id_customer")),rs.getString("room_number"),rs.getInt("duration"),rs.getString("name");
            }
        }
        catch (SQLException e) {System.out.println(e.getMessage());}
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {new LoginFrame().setVisible(true); this.dispose(); }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {new FormDialog(this).setVisible(true); }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        int r = tabelCustomer.getSelectedRow();
        if(r==-1) return;
        new FormDialog(this).setVisible(true)
    }
}
}