package Array2d;

import java.util.Scanner;

public class InputAndPrint {

	public static void main(String[] args) {

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
            for(int i=0; i<row; i++) {
            	for(int j=0; j<cols; j++) {
            		System.out.print(arr[i][j] + " | ");
            	}
            	System.out.println();
            }
	}

}
