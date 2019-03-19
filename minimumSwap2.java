package javaapplication1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class minimumSwap2 
{
// Method for getting the maximum value
    public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
 
  // Method for getting the minimum value
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 

    public static int[] arrstartAtZero(int[] arr)
    {    
    int minarr = getMin(arr);
    
    for (int i=0; i < arr.length; i++){ arr[i] = arr[i] - minarr;}
                        
    return arr;
    }
    
    public static int minimumSwaps(int[]arr) {
       
    arr = arrstartAtZero(arr);
    int counter=0;
    int length = arr.length;
    boolean [] checked = new boolean [arr.length];  
    for (int i=0; i < arr.length; i++){ checked[i]=false;}
    
    HashMap<Integer, Integer> arr_dict = new HashMap<Integer, Integer>();
    int c_count=0;
    
    for (int i=0; i < arr.length; i++)  {  arr_dict.put(arr[i], i);  }
    
        
                
    for (int key=0; key < arr.length; key++)
    {        
           if (checked[key] || key==arr_dict.get(key)) 
        {
            continue;
        }
       
           else {
            c_count=0;
            int value = key;

            while (!checked[value]){
                checked[value]=true;
                value = arr_dict.get(value);
                c_count +=1;
            }
        counter+= c_count-1;
                }
    }
           
    return counter;

    
    }
    
public static void main(String[] args) 
{
        // TODO code application logic here
int arr[] = {2, 3, 4, 1, 5};
System.out.println(minimumSwaps(arr));
}


    
    
}

