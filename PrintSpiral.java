package Array2d;

public class PrintSpiral {
	
	public static void printSpiralArray(int [][]arr) {
		int row = arr.length;
		int cols = arr[0].length;
		int count = row * cols;
		//System.out.println(count);
		
		int rs = 0;
		int re = arr.length - 1;
		int cs = 0;
		int ce = arr[0].length - 1;
		//int c=0;
		int i=0;
		int j=0;
		while(count > 0) {
			//left to right
		        while(j <= ce) { //j==0
		        	System.out.print(arr[i][j] + " ");
		        	count--;
		        	j++; //j==4
		        }
		        rs++; //rs ==1
		        j--; // j==3
		        i = rs; //i==1
		        while(i <=re) {  
		        	System.out.print(arr[i][j] + " ");
		        	count--;
                    i++;  //i==4
		        }
		        ce--; //ce==2
		        j=ce; //j == 2
		        i--; //i==3
		        while(j >= cs) {
		        	System.out.print(arr[i][j] + " ");
		        	count--;
		        	j--; //j== -1
		        }
		        re--; //re==2
		        i--; //i==2
		        j++; //j==0
		        while(i >= rs) {
		        	System.out.print(arr[i][j] + " ");
		        	count--;
		        	i--; // 
		        }
		        cs++;
		        i++;
		        j=cs;
		        
		}
		
		
	}

	public static void main(String[] args) {

              int [][]arr= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
              printSpiralArray(arr);

	}

}
