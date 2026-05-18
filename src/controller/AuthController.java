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
public class AuthController {
    private UserDAO userDAO;private static int loginAttempts = 0;
    public AuthController() {
        this.userDAO = new UserDAO();
    }
    public boolean register(String nl, String un, String pw) {
        if ( nl.isEmpty() || pw.isEmpty()) {
            JOptionPane.showMessageDialog(null, "semmua field harus diisi !", "peringatan!" , 2);
            return false ;
        }
        if (userDAO.registerUser(un,pw)) {
            JOptionPane.showMessageDialog(null, "Registrasi Berhasil !");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Registrasi Gagal !");
            return false;
        }
    }
    
    public boolean login (String un, String pw) {
        if (un.isEmpty() || pw.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tidak Boleh Kosong!", "Peringatan",2);
            return false;
        }
        if (userDAO.loginUser(un,pw)) {
            JOptionPane.showMessageDialog(null, "LoginBerhasil");
            loginAttempts = 0;
            return true;
        }
        loginAttempts++ ; int sisa = 3 - loginAttempts;
        if (loginAttempts >+ 3) {
             JOptionPane.showMessageDialog(null, "Gagal 3 Kali, Aplikasi Ditutup", "Error", 0);
             System.exit(0);
        } else {
             JOptionPane.showMessageDialog(null, "Salah, sisa percobaan :" + sisa , "Gagal", 0);
        }
        return false;
    }
}
