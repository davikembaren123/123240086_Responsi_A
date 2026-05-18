/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab Informatika
 */
public class ItemController {
    private ItemDAO itemDAO;
    public ItemController(){
        this.itemDAO = new ItemDAO();
    }
    private boolean cek(String a, String b, String c, String d){
        return a.isEmpty() || b.isEmpty() || c.isEmpty() || d.isEmpty();
    }
    public void tambahCustomer (String id_customer) {
        try {if(itemDAO.tambahCustomer(new customer(0,jd,Integer.parseInt(th),super,is)))
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            }
    }
}
