package Array2d;

import java.util.Scanner;

public class FunctionWith2dArray {
	
	public static int [][]takeInput(){
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Rows:-");
        int row=sc.nextInt();
        System.out.println("Enter the column:-");
        int cols=sc.nextInt()
;
        int [][]arr = new int [row][cols];
        
        for(int i=0; i<row; i++) {
        	for(int j=0; j<cols; j++) {
        		System.out.println("Enter the " + i + "th and " + j + "th Element");
        		arr[i][j] = sc.nextInt();
        	}
        }
        return arr;
	}
	
	public static void printArray(int [][] arr) {
		int row=arr.length;
		int cols=arr[0].length;
		for(int i=0; i<row; i++) {
        	for(int j=0; j<cols; j++) {
        		System.out.print(" | " + arr[i][j] + " | ");
        	}
        	System.out.println();
        }
	}

	public static void main(String[] args) {
		
		int [][]arr2d = takeInput();
		printArray(arr2d);

	}

}
