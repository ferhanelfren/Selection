/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection;

import java.util.Scanner;

/**
 *
 * @author GOD
 */
public class Selection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int size, i, j, temp;  
       int arr[] = new int[50];  
       Scanner scan = new Scanner(System.in);  
         
       System.out.print("Enter Array Size : ");  
       size = scan.nextInt();  
         
       System.out.print("Enter Array Elements : ");  
       for(i=0; i<size; i++)  
       {  
           arr[i] = scan.nextInt();  
       }  
         
       System.out.print("Sorting Array using Selection Sort Technique..\n");  
       for(i=0; i<size; i++)  
       {  
           for(j=i+1; j<size; j++)  
           {  
               if(arr[i] > arr[j])  
               {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }  
           }  
       }  
         
       System.out.print("Now the Array after Sorting is :\n");  
       for(i=0; i<size; i++)  
       {  
           System.out.print(arr[i]+ "  ");  
       }  
        
        
        
        
        
        
    }
    
}
