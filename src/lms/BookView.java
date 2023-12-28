package lms;

import java.util.Scanner;

public class BookView {
	static Scanner sc = new Scanner(System.in);
	static {
		System.out.println("Welcome to Library Management System");
	}

	public static void main(String[] args) {
		BookController book = new BookController();
		boolean flag = true;
		while (flag) {
			System.out.println(
					"Enter\n 1 to add book\n 2 to search\n 3 to borrow\n 4 to return the book\n 5 to remove book\n 6 to sort\n 7 to exit");
			switch (sc.nextInt()) {
			case 1: {
				book.addBook();
				break;
			}
			case 2: {
				book.searchBook();
				break;
			}
			case 7: {
				flag = false;
				System.out.println("thankyou");
				break;
			}
			case 3: {
				book.borrowBook();
				break;
			}
			case 4: {
				book.returnBook();
				break;
			}
			case 5: {
				book.removeBook();
				break;
			}
			case 6: {
				book.sortBooks();
				break;
			}
			default:
				System.out.println("wrong choice");
				break;
			}
		}

	}
}

