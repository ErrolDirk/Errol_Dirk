/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author JUDICAEL
 */
public class NewYearChaos 
{
        static void minimumBribes(int[] q) 
  {

    int nbribe = 0;
    boolean chaos = false;
    int n= q.length;
    for(int i = 0; i < n; i++)
    {
            if(q[i]-(i+1) > 2)
            {              
                chaos = true;
                break;    
            }
            else {
            for (int j = Math.max(0, q[i]-2); j < i; j++){
                           
                if (q[j] > q[i]){nbribe++;}
                
            }
            }
    }
    
    if(chaos) {System.out.println("Too chaotic");}
    else {System.out.println(nbribe);}
    }

    
public static void main(String[] args) 
{
int [] q = {1, 2, 5, 3, 7, 8, 6, 4};
    minimumBribes(q);

}    
    
    
}
