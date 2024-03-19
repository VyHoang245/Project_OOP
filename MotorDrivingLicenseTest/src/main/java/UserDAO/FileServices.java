/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserDAO;

import Person.User;
import com.mycompany.motordrivinglicensetest.Question;
import java.io.File;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author vygir
 */
public class FileServices {

    public static void saveAllUsers(ArrayList<User> list) {
        
        try (PrintWriter pw = new PrintWriter(new File("D:\\Users.DAT"))) {
            for (User u : list) {
                pw.println(u.getName());
                pw.println(u.getPass());
                pw.println(u.getGrade());
            }
        } catch (Exception e) {
            System.out.println("Got an exception: " + e.getMessage());
        }
        
    }

    public static ArrayList<User> readAllUsers() {
        ArrayList<User> list = new ArrayList<>();

        try (Scanner reader = new Scanner(new File("D:\\Users.DAT"))) {
            while (reader.hasNext()) {
                User u = new User();
                u.setName((String) (reader.nextLine()));
                u.setPass((String) (reader.nextLine()));
                u.setGrade((Double) (reader.nextDouble()));
                reader.nextLine();
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println("Got an exception");
        }
        return list;
    }

    public static void saveQuestion(ArrayList<Question> list) {
       
        try (PrintWriter pw = new PrintWriter(new File("D:\\questions.DAT"))) {
            for (Question u : list) {
                pw.println(u.getQuestion());
                pw.println(u.getAnswerA());
                pw.println(u.getAnswerB());
                pw.println(u.getAnswerC());
                pw.println(u.getAnswerD());
                pw.println(u.getKey());
                //pw.println(u.getSelectedAnswer());
            }
        } catch (Exception e) {
            System.out.println("Got an exception: " + e.getMessage());
        }
    }

    public static ArrayList<Question> readQuestions() {
        ArrayList<Question> list = new ArrayList<>();
        try (Scanner reader = new Scanner(new File("D:\\questions.DAT"))) {
            while (reader.hasNext()) {
                Question u = new Question();
                u.setQuestion((String) (reader.nextLine()));
                u.setAnswerA((String) (reader.nextLine()));
                u.setAnswerB((String) (reader.nextLine()));
                u.setAnswerC((String) (reader.nextLine()));
                u.setAnswerD((String) (reader.nextLine()));
                u.setKey((String) (reader.nextLine()));
                //u.setSelectedAnswer((String) (reader.next()));
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println("Got an exception");
        }
        return list;
    }

}
