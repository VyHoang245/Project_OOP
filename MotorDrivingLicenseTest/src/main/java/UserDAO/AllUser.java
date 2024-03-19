/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserDAO;

import Person.User;
import java.util.ArrayList;

/**
 *
 * @author vygir
 */
public class AllUser extends FileServices{
    public static ArrayList<User> data = readAllUsers();

    public AllUser() {
    }

    public static ArrayList<User> getData() {
        return data;
    }

    public static void setData(ArrayList<User> data) {
        AllUser.data = data;
    }
    
}
