import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class q4 {

	static void search(int[] arr, int s) {
		boolean found = false;
		System.out.println("Found at");
		int pos = 0;
		for(int ele : arr) {
			
			if(ele == s) {
				System.out.print( pos + ",");
				found = true;
			}
			pos = pos + 1;
		}
		if(found == false) {
			System.out.println("Nowhere to be found");
		
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the value of key:");
		int s = sc.nextInt();
		search(arr, s);
	}

}
