package Array2d;

public class practice {
	
	public static void sumOfBoundryElement(int [][] arr) {
		int row=arr.length;
		int cols=arr[0].length;
		int sum=0;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<cols; j++) {
				sum += arr[i][j];
				//System.out.print(arr[i][j] + " ");
			}
			
		}
		System.out.println(sum);
	}
	


	public static void main(String[] args) {

      int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
      //System.out.println(arr.length);
      sumOfBoundryElement(arr);

	}

}
