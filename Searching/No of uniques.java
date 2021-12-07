/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	int i=0,j=0;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter size : ");
	int n = input.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter elements : ");
for(i=0;i<n;i++){
	arr[i] = input.nextInt();
       }
for(i=0;i<n;i++){
  for(j=0;j<n;j++)
    if(arr[i]==arr[j])
		break;
	if(i==j)
	    System.out.println(arr[i]+" ");
       }
	}
}
