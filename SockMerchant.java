package javaapplication1;

import java.util.Arrays;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class SockMerchant {
    
    // Complete the sockMerchant function below.
      
     static int sockMerchant(int n, int[] ar) {
         int count =0;
        Arrays.sort(ar);
        
         for (int i=0; i<(n-1);) 
        {
            if (ar[i]==ar[i+1]) 
            {
                count = count+1;
                i=i+2;
            }
            else 
            {   
                i=i+1;
                
            }
        }
        

    return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
/*        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
        */
        
        int[] ar = {1, 2, 1, 2, 1, 3, 2};
        int n =7;
        int result = sockMerchant(n, ar);
        System.out.println(result); 
        
    }
}

    
