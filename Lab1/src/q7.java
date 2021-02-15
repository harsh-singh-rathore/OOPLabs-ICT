import java.util.Scanner;

public class q7 {
	
	public class time {
		private int h, m, s;
		time() {
			h = m = s = 0;
		}
		time(int a, int b, int c) {
			s = c%60;
			m = (b + c/60)%60;
			h = a + (b + c/60)/60;
		}
		
		public time add(time a, time b) {
			time c = new time(a.h + b. h + (a.m+b.m + (a.s+b.s)/60)/60, (a.m+b.m + (a.s+b.s)/60)%60,(a.s+b.s)%60);
			
			return c;
		}
		public void printTime(time a) {
			System.out.println(a.h+":"+a.m+":"+a.s);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	}

}
