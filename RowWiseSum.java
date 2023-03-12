package Array2d;

public class RowWiseSum {
	
	public static void rowWiseSum(int [][]arr) {
		int row=arr.length;
		int cols=arr[0].length;
		int sum = 0;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<cols; j++) {
				
				sum = sum + arr[i][j];
				
			}
			System.out.print(sum + " ");
			sum=0;
		}
	}

	public static void main(String[] args) {
		
		int [][]arr= {{1,2,3,4,5,6},{2,3,4,5,6,7},{3,4,5,6,7,8}};
		rowWiseSum(arr);
	}

}
