import java.util.Scanner;


public class q1 {

	/*
	 * Logic -
	 * Write a Java program to print table of number entered by user
	 * Take in input then run a loop till 10 and multiply the i incremented at each iteration to the number
	 * entered by the user then display it thus getting the desired output
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		
		
		for(int i = 0; i< 10; i++) {
			System.out.println(a + " X " + i + " = " + a*i);
		}		
		
		sc.close();
	}

}
