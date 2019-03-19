package javaapplication1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnClouds 
{

    public static void main(String[] args) throws IOException { 
    
    int jump=0;
    int[] c= new int[]{0, 0, 1, 0, 0, 1, 0};
    int n = c.length;
    int i =0;
    while(i<n-1) {
        if ((i+2)<n && c[i+2]==0)
        {jump = jump+1;
            i+=2;
        }
        else if (c[i+1]==0)
        { jump = jump+1;
            i+=1;
        }
        }
    
    }
}
