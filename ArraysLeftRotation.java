/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author JUDICAEL
 */
public class ArraysLeftRotation 
{
    
    // Complete the rotLeft function below.
    public static int[] convertListIntegersToIntArray(ArrayList<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
    
    
    public static ArrayList<Integer> convertIntArrayToArrayList(int[] a)
    {    
    ArrayList<Integer> newlist = new ArrayList<Integer>();
    for (int i : a)
    {
        newlist.add(i);
    }
    return newlist;
    }
    

    static int[] rotLeft(int[] a, int d) {

    ArrayList<Integer> newlist = new ArrayList<Integer>();
    newlist = convertIntArrayToArrayList(a);

    int l = a.length;
    int nIteration = d%l;
    int value;

    for (int j=0; j< nIteration;j++)
    {
            value = newlist.get(0);
            newlist.remove(0);
            newlist.add (value);
    }

    return  convertListIntegersToIntArray(newlist);
    }

    
public static void main(String[] args) 
{
        // TODO code application logic here
int a[] = {1, 2, 3, 4, 5};
int d=54;

int result[] = new int[a.length];

result= rotLeft(a,d);

for (int i=0; i< a.length;i++)
    {
System.out.println(result[i]);
    }

    
    
}
    
    
}
