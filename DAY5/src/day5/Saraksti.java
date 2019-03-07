/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Saraksti {
    
    public ArrayList<Integer> ievade()
    {
      
             
         
        ArrayList<Integer> skaitli = new ArrayList<Integer>();
        
         
        
        return skaitli;
        
        
    }
    public void skaitluSumma()
    {
      Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi cik skaitlus tu gribi pieklut listam: ");
        int a = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        int summa = 0;
        for(int i = 0; i < a; i++)            
        {
            System.out.println("Ievadi " + i + ". skaitli");
            list1.add(sc.nextInt());
            
            summa = summa + list1.get(i);
        }
        System.out.println(summa);
                
    }
    public void paraVaiNepara()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi cik skaitlus tu gribi pieklut listam: ");
        int a = sc.nextInt();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < a; i++){
             System.out.println("Ievadi " + i + ". skaitli");
            list2.add(sc.nextInt());
            if(list2.get(i)%2==0){
                list2.remove(i);
                list2.add(0);
            }
        }
        System.out.println(list2);
    }
}
//ArrayList<Integer> skaitli = ievade(); Вызов функции