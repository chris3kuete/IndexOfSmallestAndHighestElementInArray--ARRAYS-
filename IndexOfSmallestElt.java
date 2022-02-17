/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexofsmallestelt;

import java.util.Scanner;

/**
 *
 * @author sa
 */
public class IndexOfSmallestElt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double[] index = new double[10];
        
        System.out.println("Enter 10 integers ");
        for (int i = 0; i < 10; i++) {
            index[i]=scan.nextInt();
            
        }
        int minimum = indexOfSmallest(index);
        System.out.println("the index of the smallest element in the array is "+ minimum);
        
        int maximum = indexOfHighest(index);
        System.out.println("the index of the smallest element in the array is "+ maximum);
    }
    
    public static int indexOfSmallest(double[] array){
        
        int v = 0;
        double minArray;
        minArray=array[3];
        int minIndex = v;
        int count=1;
        
        for (int i = 0; i < array.length; i++) {
            if(array[i]< minArray){
                minArray=array[i];
                v=i;
                count++;
                
            }
        }
        System.out.println("the smallest number appear "+ count +" times");
        return v;
    }
    public static int indexOfHighest(double[] array){
        
        int w = 0;
        double maxArray;
        maxArray = array[5];
        int maxIndex = w;
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxArray){
                maxArray = array[i];
                w = i;
            }
            
        }
        return w;
    }
    
}
