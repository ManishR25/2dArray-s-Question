package Array2d;

public class ArrayWithDifferentNumberRow {

	public static void main(String[] args) {
		
		int [][]arr=new int[4][];
		
		//System.out.println(arr);
		//System.out.println(arr[0]);
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = new int[i + 1];
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
