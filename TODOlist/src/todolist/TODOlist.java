/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TODOlist {

    static ArrayList<String> uzd = new ArrayList<String>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        while (true) {
            todolist();
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose what to do - 1.Add new // 2.Delete one of // 3.Delete all");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    addEx();
                    break;
                case "2":
                    Del();
                    break;
                case "3":
                    DelAll();
                    break;
                case "0":
                    return;
                default:
                    break;
            }
        }
    }

    public static void todolist() {

        Scanner sc = new Scanner(System.in);
        String path = "C:\\Users\\User\\Desktop\\sample.txt";
        uzd.clear();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
                uzd.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("error");
        }

    }

    public static void addEx() {
        System.out.println("Enter new exercise to do:");
        String path = "C:\\Users\\User\\Desktop\\sample.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            Scanner sc = new Scanner(System.in);
            bufferedWriter.newLine();
            bufferedWriter.append(sc.nextLine());

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    public static void Del() {
        Scanner sc = new Scanner(System.in);
        String path = "C:\\Users\\User\\Desktop\\sample.txt";
        System.out.println("Choose what do you want to delete: ");
        uzd.remove((int)1);
        
        for(int i=0; i< uzd.size(); i++){
            System.out.println(uzd.get(i));
        }

//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
//           bufferedWriter.write("");
//            for (int i = 0; i < uzd.size(); i++) {
//
//                bufferedWriter.append(uzd.get(i));
////System.out.println(uzd.get(i));
//                bufferedWriter.newLine();
//            }
            
//            bufferedWriter.close();
//        } catch (IOException e) {
//            System.out.println("error");
//        }
    }

    public static void DelAll() {
        String path = "C:\\Users\\User\\Desktop\\sample.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            uzd.clear();
            bufferedWriter.write("");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }

}
