import java.util.Scanner;


public class q6 {
	
	public static void matrixMul(int r1, int c1, int a[][], int r2, int c2, int b[][]) {
		if(c1 != r2) {
			System.out.println("Can't multiply matrices");
			return;
		}
		int r3=r1, c3=c2;
		int c[][] = new int[r3][c3];
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				c[i][j]= 0;
				for(int k=0; k<c1; k++) {
					c[i][j] = c[i][j] + a[i][k]*b[k][j];
				}
			}
		}
	}
	
	public static void add(int r1, int c1, int a[][], int r2, int c2, int b[][]) {
		if (r1 != r2 && c1 != c2) {
			System.out.println("can't add the matrices");
			return;
		}
		int c[][] = new int[r1][c1];
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		printMat(r1, c1, c);
	}
	
	public static void printMat(int r, int c, int mat[][]) {
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(mat[i][j]+" ");
			} System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r1, c1, r2, c2;
		System.out.println("Enter value in arr1");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		int mat1[][] = new int[r1][c1];
		System.out.println("Enter into array 1");
		for(int i =0 ; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter value in arr2");
		r2 = sc.nextInt();
		c2 = sc.nextInt();
		System.out.println("Enter into array 2");
		int mat2[][] = new int[r2][c2];
		for(int i = 0; i<r2; i++) {
			for(int j=0; j<c2; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		
		add(r1, c1, mat1, r2, c2, mat2);
		
		
		
		
		
	}
}
