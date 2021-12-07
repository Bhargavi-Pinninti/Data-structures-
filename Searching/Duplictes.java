/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int i=0,count=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Size of an array: ");
		int n = input.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements : ");
for(i=0;i<n;i++){
	arr[i] = input.nextInt();
     }
     System.out.println("Enter key : ");
     int k=input.nextInt();
for(i=0;i<n;i++){
	if(arr[i]==k){
		count++;
	}
}
if(count>=1)
     System.out.println("True");
else
     System.out.println("False");
  }
}

