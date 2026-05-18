/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class User {
    private int id_user; private String name, username, password;
    public User(int id_user ,String nl, String un, String pw) {
        this.id_user = id_user; this.name = nl; this.username = un; this.password = pw;
    }
    public User(String nl, String un, String pw) {
        this.name =  nl; this.username= un; this.password = pw;
    }
    public int getId_user() {
        return id_user;
    }
    public void setId_user(int id_user) {
        this.id_user = id_user ;
    }
}
