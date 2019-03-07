/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DAY5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PirmaUzdevumaMenu();
    }

    private static void PirmaUzdevumaMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Skaitlu summa ");
        System.out.println("2.Para vai Nepara ");
        
        int x = -1;
        Saraksti sar = new Saraksti();
        while (x != 0) {
            System.out.println("Izvelies 1 , 2 vai 0 lai beigt: ");
             x = sc.nextInt();
            switch (x) {

                case 1:

                    sar.skaitluSumma();
                    break;
                case 2:

                    sar.paraVaiNepara();
                    break;

            }
        }

    }

}
