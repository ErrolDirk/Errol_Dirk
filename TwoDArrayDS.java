package javaapplication1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import java.io.IOException;

/**
 *
 * @author JUDICAEL
 */
public class TwoDArrayDS 
{
public static void main(String[] args) throws IOException 
{
    int[][] arr = {{-9, -9, -9, 1, 1, 1},  {0, -9, 0, 4, 3, 2},{-9, -9, -9, 1, 2, 3}, {0, 0, 8, 6, 6, 0}, {0, 0, 0, -2, 0, 0}, {0, 0, 1, 2, 4, 0}};

int sum=0;
int ncol = arr[0].length;
int nrow = arr.length;


int maxValue=0;
ArrayList<Integer> sumlist = new ArrayList<Integer>();

for (int i=0; i<nrow; i++){
    for (int j=0; j<ncol; j++){
        if (j<(ncol-2) && i<(nrow-2)){
            sum = arr[i][j]+ arr[i][j+1]+ arr[i][j+2]+ arr[i+1][j+1]+ arr[i+2][j]+ arr[i+2][j+1]+ arr[i+2][j+2];
            sumlist.add((sum ));
 System.out.println(sum);                    
                    }
                    }
                     }
 System.out.println(sumlist);
 maxValue = Collections.max(sumlist);
System.out.println(maxValue);


    
    
    
}

}
