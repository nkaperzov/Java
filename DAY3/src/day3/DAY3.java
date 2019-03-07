/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DAY3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
        NewClass jaunsObjekts = new NewClass();
        NewClass.fun();
        jaunsObjekts.funPrivate();
        
    }
    
    public static void pieciskaitli(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi piecus skaitlus pec karta:");
        int sum = 0;
        
        
        
        
        
        for(int i = 0; i < 5; i++)
        {            
            int sk = sc.nextInt();
            sum+= sk;
           
        }
        System.out.println(sum);
        
        
        
    }
    
    public static void menu()
    {
    Scanner sc = new Scanner(System.in);
    int izvele = 1;
    
    while(izvele!=0)
    {
        
        System.out.println("ievadi pirmo skaitli:");
                double sk1 = sc.nextInt();
                  System.out.println("ievadi otro skaitli:");
                double sk2 = sc.nextInt();
                System.out.println("Izveleties, ko gribat darit - 1, 2 , 3 ,4 ,5 vai 0");
    izvele = sc.nextInt();
        
        
        
        
        switch(izvele)
        {
            case 1:
                System.out.println(sk1 + sk2);
                break;
            case 2:
                System.out.println(sk1 - sk2);
                break;
            case 3: 
                System.out.println(sk1 * sk2);
                break;
            case 4: 
                System.out.println(sk1 / sk2);
                break;
            case 5:
                double result = 1;
                 for(int i = 0; i < sk2; i++)
                 {
                     result = result * sk1;
                 }
                 
        
                System.out.println(result);
                break;
        }
    }
    
    
 
    
    }
            
}
