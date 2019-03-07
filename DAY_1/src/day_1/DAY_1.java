/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DAY_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Hello World");
       loginsUnParole();
                  
    }
    private static void vardaIevade(){
    Scanner sc = new Scanner (System.in);
        
        
        System.out.println("Ievadi savu vardu");
        String vards = sc.nextLine();
        
        System.out.println("Ievadi savu uzvardu");
        String uzvards = sc.nextLine();
        System.out.print("Sveiki" + " " + vards + " " + uzvards);
                
        
        
        
       
    }
    
    private static void zarosanas()
    {
        int a =5;
        if (a==5)
        {
            
        }
        else
        {
        
        }
        
        String b = "c";
        if(b.equals("a"))
        {
            
        }
        else if(b.equals("c"))
        {
            
        }
        else
        {
            
        }
        
        switch(a)
        {
            case 1:
                //kas notiek
                break;
            case 2:
                break;
            default:
                break;
        }
            
    }
    private static void numberstars()
    {
        Scanner num = new Scanner(System.in); 
        System.out.println("Ievadi skaitli ");
        int a = num.nextInt();
        if (a > 5)
        {
            System.out.println("**");
        }
        else if (a < 5)
        {
            System.out.println("*");
        }
        else if (a == 5)
        {
            System.out.println("**");
        }
        else
        {
            System.out.println("SOMETHING WENT WRONG");
        }
        
        String simboli = "aaa";
        int b = simboli.length();
    }
    
    private static void loginsUnParole()
    {
        Scanner iev = new Scanner(System.in);
        String logins = "lietotajs";
        String parole = "abc123";
    
        
        System.out.println("Login: ");
        String login1 = iev.nextLine();
        int l = login1.length();
        
 
        
        if(1 >= 3 && l <= 12)
        {
            System.out.println("Logins OK");
        }
        else 
        {
            System.out.println("Login should be 3-12 symbols");
        }
        
       
        
        System.out.println("Password: ");
        String parole2 = iev.nextLine();
        
        int p = parole2.length();
        
        if(p >= 5 && p <= 10)
        {
            System.out.println("Password OK");
        }
        else 
        {
            System.out.println("Password lenght should be 5-10 symblos");
        }
        
        if(logins.equals(login1))
        {
            System.out.println("Login is same");
        }
        else
        {
            System.out.println("Logins is different");
        }
        
        if(parole.equals(parole2))
        {
            System.out.println("password is same");
        }
        else
        {
            System.out.println("password is different");
        }
                
    }
            
    
}
