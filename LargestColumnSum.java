package Array2d;

import java.util.Scanner;

public class LargestColumnSum {
	
	public static int [][]takeInput(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row number:-");
		int row=sc.nextInt();
		System.out.println("Enter the columns number");
		int cols=sc.nextInt();
		
		int [][]arr2d=new int[row][cols];
		
		for(int i=0; i<row; i++) 
		{
			for(int j=0; j<cols; j++) {
				System.out.println("Enter the i" + i  +"th element and j" + j + "th element");
				arr2d[i][j]=sc.nextInt();
			}
		}
		return arr2d;
	}
	
	public static void largestColSum(int [][] mat) {
		int row=mat.length;
		int cols = mat[0].length;
		int maxcol=Integer.MIN_VALUE;
		boolean isRow=true;
		int idx=-1;
		
		//row wise sum
		for(int i=0; i<row; i++) {
			int sum=0;
			for(int j=0; j<cols; j++) {
				sum = sum + mat[i][j];
				
			}
			if(sum > maxcol) {
				maxcol = sum;
				//System.out.println("column "  + j + " " + maxcol);
				isRow=true;
				idx=i;
			}
			
		} 
		
		for(int j=0; j<cols; j++) {
			int sum=0;
			for(int i=0; i<row; i++) {
				sum = sum + mat[i][j];
				
			}
			if(sum > maxcol) {
				maxcol = sum;
				//System.out.println("column "  + j + " " + maxcol);
				isRow=false;
				idx=j;
			}
			
		}

		if(isRow == true){
			System.out.println("row "  + idx + " " + maxcol);
		}else{
			System.out.println("column "  + idx + " " + maxcol);
		}
	
		
	}

	public static void main(String[] args) {
        
		int [][] arr= takeInput();
		largestColSum(arr);
		//System.out.println(result);
       
	}

}
