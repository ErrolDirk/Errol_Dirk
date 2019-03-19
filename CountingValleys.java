package javaapplication1;
import java.util.Arrays;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class CountingValleys 
{

    
    
    public static void main(String[] args) throws IOException {
      String s = "DDUUUUDD";
      s = "0"+s;
      int count=0;
      
      int n= s.length();
     
      String[] sArr = s.split("");
      int[] nArr = new int[n+1];
      nArr[0]=0;
      
      for (int i=1; i<n; i++)
      {
      if (sArr[i].equals("D")) {nArr[i]= nArr[i-1] - 1;}
      else {nArr[i]= nArr[i-1] + 1;}
               
      }
      
      for (int i=1; i<n; i++)
      {
      
      if (nArr[i]==0 && nArr[i-1]<0)
      {count = count+1;
      }
      
      else 
      {
      }
      
      }
      System.out.println(count);
    } 
    
}
