/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import controller.ItemController;

/**
 *
 * @author Lab Informatika
 */
public class FormDialog extends javax.swing.JFrame{
    private boolean isEdit = false; private int idltem = 0; private MainFrame mainFrame;
    public FormDialog(MainFrame mf) {
        initComponents();
        this.mainFrame = mf;
        setTitle("Tambah");
        setLocationRelativeTo(null);
    }
    public FormDialog(MainFrame mf) {
        initComponents();
        this.mainFrame = mf;
        setTitle("Tambah");
        setLocationRelativeTo(null);
    }
}
