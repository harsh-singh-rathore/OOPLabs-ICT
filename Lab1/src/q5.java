import java.util.Scanner;


public class q5 {
	
	/*
	 * Logic -
	 * TO show the other diagonal of a Matrix we find the relation that 4-j-1 == i is the indices of the element
	 * then we next a dual loop with one going through the rows of the mat and the nested one on the columns
	 * when ever the above condition is true we display the element thus getting the desired output
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		int arr[][] = {{1, 3, 3, 4}, 
					   {5, 6, 7, 8},
					   {9, 10, 11, 12},
					   {13, 14, 15, 16}};
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(4-j-1 == i) {
					System.out.println(arr[i][j]);
				}
			}
		}
	}

}
