/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import java.util.ArrayList;

/**
 *
 * @author vygir
 */
public class User {
    private String name;
    private String pass;
    private boolean admin = false;
    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public User(String name, String pass) {
        
        this.name = name;
        this.pass = pass;
    }

    public User() {
    }
    public boolean isAdmin(){
        if(name.compareTo("admin")==0 && pass.compareTo("1234")==0){
            admin = true;
            return true;
        }
        return false;
    }
    
    
    
}
