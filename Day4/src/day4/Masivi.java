/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Masivi {

    public void viendimensiju() {
        int[] masivs = new int[3];

        Scanner sc = new Scanner(System.in);
        masivs[0] = 1;
        masivs[1] = 2;
        masivs[2] = 3;

        for (int i = 0; i < masivs.length; i++) {
            masivs[i] = sc.nextInt();
        }
    }

    public void summa() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi masiva garumu: ");
        int a = sc.nextInt();
        int[] masivs = new int[a];
        System.out.println("Ievadi");
        for (int i = 0; i < masivs.length; i++) {
            System.out.println("Ievadi " + i + ". skaitli");
            masivs[i] = sc.nextInt();
        }

        int summa = 0;

        for (int i = 0; i < masivs.length; i++) {
            summa += masivs[i];
        }
        System.out.println(summa);
    }

    public static void stars() {
        String masivs[] = new String[4];

        String a = "";

        for (int i = 0; i < 4; i++) {
            a = a + "*";
            masivs[i] = a;

        }

        for (int i = 0; i < masivs.length; i++) {
            System.out.println(masivs[i]);

        }
        for (int i = 2; i >= 0; i--) {
            System.out.println(masivs[i]);
        }

    }

    public void nepara() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi masiva garumu:");
        int a = sc.nextInt();

        int[] masivs = new int[a];

        for (int i = 0; i < masivs.length; i++) {
            System.out.println("Ievadi masivas " + i + ". skaitli");
            masivs[i] = sc.nextInt();

        }
        for (int i = 0; i < masivs.length; i++) {
            if (masivs[i] % 2 == 0) {
                System.out.println(masivs[i]);
            } else {
                masivs[i] = 0;
                System.out.println(masivs[i]);
            }
        }
    }

    public void saraksts() {
        
        List<Integer> sksr = new ArrayList<>();
        
        sksr.add(2);
        sksr.add(3);
 for(int sk: sksr)
 {
     System.out.println("sk");
 }
    }
}
