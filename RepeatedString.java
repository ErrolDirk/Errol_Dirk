/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;

/**
 *
 * @author JUDICAEL
 */
public class RepeatedString {
    
public static void main(String[] args) throws IOException { 
    
String s= "aba";
int n= 10;  

String[] sArr = s.split("");


int count=0;
int count2=0;
int mod = n%s.length();
String[] sArr2 = new String[mod] ;
for (int i=0; i<mod; i++){sArr2[i] =sArr[i];}

int r =0;
        
for (int i=0; i<s.length(); i++){ if (sArr[i].equals("a")){count+=1;} }
    
if (mod!=0){
           
        for (int i=0; i<mod; i++){ if (sArr2[i].equals("a")){count2+=1;} }
        
        r = n/s.length();
        
        count = count *r + count2;
        
                }
else if (mod==0) { 
        r = n/s.length();
        count = count *r;
                }

System.out.println(count);


}
     
     
}
