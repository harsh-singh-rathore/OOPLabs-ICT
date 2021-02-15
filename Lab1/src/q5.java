import java.util.Scanner;


public class q5 {

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
