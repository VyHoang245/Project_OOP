/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserDAO;

import Person.User;
import java.util.*;
import UserDAO.AllUser;
import static UserDAO.AllUser.getData;
import UserDAO.FileServices;
import static UserDAO.FileServices.saveAllUsers;
/**
 *
 * @author vygir
 */
public class AccountServices {
    public static boolean checkAccountExisted(String username) {
        ArrayList<User> users = AllUser.data;
        for (User u : users) {
            if (u.getName().equals(username)) {
                return true;
            }
        }
        return false;
    }
    public static User getAccount(String username) {
        for (User each : getData()) {
            if (each.getName().equals(username)) {
                return each;
            }
        }
        return null;
    }
    public static void addUser(String name, String password){
        User u = new User(name, password);
        AllUser.data.add(u);
        saveAllUsers(AllUser.data);
    }
    public static void changeGrade(User u){
        for (User each : getData()) {
            if (each.getName().equals(u.getName())) {
                AllUser.data.remove(each);
                AllUser.data.add(u);
                saveAllUsers(AllUser.data);
                break;
            }
        }
    }
    
}
