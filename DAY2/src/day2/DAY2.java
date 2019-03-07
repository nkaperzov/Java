/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DAY2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        stars1();
    }
    private static void zarosanasuzdevumi(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ievadi a vertibu: ");
    int sk1 = sc.nextInt();
    System.out.println("Ievadi b vertibu: ");
    int sk2 = sc.nextInt();
    System.out.println("Izvelies ko darit: ");
    String darisana = sc.next();
    
    if(darisana.equals("saskaitit"))
    {
       System.out.println(sk1 + sk2);
    }
    else if(darisana.equals("atnemt")) 
    {
       System.out.println(sk1 - sk2);
    }
    else if(darisana.equals("-"))
    {
        boolean c = nulleLidzDesmit(sk1, sk2);
        if(c == true)
        {
            System.out.println("OK");
        }
        else if(c == false)
        {
            System.out.println("NOT OK");
        }
    }
    
    
    }
    
    private static int saskaitisana(int a, int b)
    {
        
        int result = a + b;
        
        return result;
        
        
    }
    
    private static int atnemsana (int a, int b){
        int result = a - b;
        return result;
    }
    
    private static boolean nulleLidzDesmit(int a, int b)
    {
        boolean result = true;
        if(a >= 1 && b <= 10 && a <= 10 && b >= 1)
        {
            result = true;
        }
        else
        {
            result = false;
        }
       return result;
    }
    
    private static void cikli()
    {
        // for, foreach, while, do..while
        
        for(int i = 0; i < 10; i++)
        {
            System.out.println("i");
        }
        
        int j = 0;
        
        while(j<10)
        {
            System.out.println(j);
            j++;
        }
        
        j = 0;
        do
        {
            System.out.println(j);
            j++;
        }
        while(j<10);
    }
    private static void stars1()
    {
        String a = "";
       
        
        for(int i = 0; i < 4; i++)
        {            
            a = a + "*";
            System.out.println(a);
        }
    }
    private static void kapinasana()
    {
        int skaitlis = 2;
        int pakape = 3;
        
        int result = 1;
        
        for(int i = 0; i < pakape; i++)
        {
            result = result * skaitlis;
        }
    }
    
}
