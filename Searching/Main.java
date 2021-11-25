/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import  java.util.Scanner;
public class Linear {
  public static void main(String args[])  
  {  
    int i, n, k, arr[];  
   
    Scanner input = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = input.nextInt();   
    arr = new int[n];  
   
    System.out.println("Enter those " + n + " elements");  
   
    for (i = 0; i < n; i++)  
      arr[i] = input.nextInt();  
   
    System.out.println("Enter value to find");  
    k = input.nextInt();  
   
    for (i = 0; i < n; i++) 
    {  
      if (arr[i] == k)      
      {  
         System.out.println(k + " is present at location " + (i + 1) + ".");  
          break;  
      }  
   }  
   if (k == n)  
      System.out.println(k + " isn't present in array.");  
  }  
} 
