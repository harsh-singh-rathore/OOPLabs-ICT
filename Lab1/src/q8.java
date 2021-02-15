import java.util.Scanner;
public class q8 {


	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book books[] = new Book[6];
		String title;
		String author;
		int edition;
		
		
		for(Book book : books) {
			title = sc.nextLine();
			author = sc.nextLine();
			edition = sc.nextInt();
		}
	}
	
	public class Book{
		private String title, author;
		int edition;
		Book() {
			title = "";
			author = "";
			edition = 0;
		}
		Book(String a, String b, int c) {
			title = a;
			author - b;
			edition = c;.
		}
	}

}
