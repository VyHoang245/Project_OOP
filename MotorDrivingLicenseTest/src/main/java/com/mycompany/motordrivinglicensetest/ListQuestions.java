/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motordrivinglicensetest;

import UserDAO.FileServices;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author vygir
 */
public class ListQuestions extends FileServices{
    public static ArrayList<Question> list = readQuestions();

    public ListQuestions() {
        
    }

    public ArrayList<Question> getList() {
        return list;
    }
    public void addQuestion(Question q){
        list.add(q);
        saveQuestion(list);
    }
    
}
