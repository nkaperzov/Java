/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Day9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ievade();
//       String path = "C:\\Users\\User\\Desktop\\sample.txt";
//       
//       try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))){
//       String fileContent = "This is a sample text.";
//       bufferedWriter.write(fileContent);
//       bufferedWriter.close();
//       }
//           catch(IOException e){
//                   System.out.println("Error");
//                   }

    }

    public static void paras() {
        String path = "C:\\Users\\User\\Desktop\\sample.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            int ln = Integer.parseInt(line);
            while (line != null) {

                ln = Integer.parseInt(line);
                if (ln % 2 == 0) {
                    System.out.println(ln);

                }
                line = bufferedReader.readLine();

            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    public static void ievade() {
        Scanner sc = new Scanner(System.in);
        String path = "C:\\Users\\User\\Desktop\\sample.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            for (int i = 0; i < 5; i++) {
                bufferedWriter.append(sc.nextLine());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error");
        }

    }

//   cilveks atver programmu
//           piedava vai  nu ievadit 5 vertibas un ierakstit faila
//                   var ari izvadit faila saturu
//                           beigt darbu
    static public void mix() {
        Scanner sc = new Scanner(System.in);
        String path = "C:\\Users\\User\\Desktop\\sample.txt";
        int izvele = sc.nextInt();
        switch (izvele) {
            case 1:
        }
    }
}


      System.out.println("Choose what to do - 1.Add new // 2.Delete one of // 3.Delete all");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                   
                case 2:
                    
                    
            }
            return;