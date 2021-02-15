import java.util.Scanner;

public class q3 {
	
	/*
	 * Logic - 
	 * Take in input from the user then in each iteration finding the units digit cubing it and adding it to another 
	 * number then dividing the initial number by 10 till the number becomes 0
	 * finally checking if the numbers inputted and the number obtained from the abouve algo are same or not
	 * if yes then display armstrong else not armstrong
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arm = 0, n = a;
		while(n!=0) {
			arm = arm + (int) Math.pow((n%10), 3);

			n = n/10;
		}
		if (arm == a) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");

		}

	}

}
