import java.util.Scanner;

public class q3 {

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
