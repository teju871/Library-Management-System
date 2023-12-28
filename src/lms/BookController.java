package lms;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BookController {
	ArrayList<Book> books = new ArrayList<Book>();
	Scanner sc = new Scanner(System.in);

	public void addBook() {
		System.out.println("Enter the author name");
		String author = sc.next();
		System.out.println("Enter the title");
		String title = sc.next();
		System.out.println("Enter the id");
		String id = sc.next();
		Book book = new Book(author, title, id, true);
		boolean flag = true;

		for (Book boook : books) {
			if (boook.getAuthor().equalsIgnoreCase(author) || boook.getTitle().equalsIgnoreCase(title)
					|| boook.getId().equalsIgnoreCase(id)) {
				flag = false;
			}
		}
		if (flag) {
			books.add(book);
			System.out.println("Book added to library successfully");
		} else {
			System.out.println("book already present");
		}
	}

	public void searchBook() {
		System.out.println("Enter book name or book author or id");
		String input = sc.next();
		boolean flag = true;
		for (Book book : books) {
			if (book.getAuthor().equalsIgnoreCase(input) || book.getTitle().equalsIgnoreCase(input)
					|| book.getId().equalsIgnoreCase(input)) {
				System.out.println("book found");
				System.out.println(book);
				flag = false;
			}
		}
		if (flag) {

			System.out.println("book not found");
		}

	}

	public void borrowBook() {
		System.out.println("Enter the book author or title or id");
		String input = sc.next();
		boolean flag = true;
		for (Book book : books) {
			if (book.isAvailable()) {
				if (book.getAuthor().equalsIgnoreCase(input) || book.getTitle().equalsIgnoreCase(input)
						|| book.getId().equalsIgnoreCase(input)) {
					System.out.println("book borrowed");
					System.out.println(book);
					book.setAvailable(false);
					flag = false;

				}
			}
		}
		if (flag) {
			System.out.println("book not found");
		}

	}

	public void returnBook() {
		System.out.println("Enter the book author or title or id");
		String input = sc.next();
		boolean flag = true;
		for (Book book : books) {
			if (!book.isAvailable()) {
				if (book.getAuthor().equalsIgnoreCase(input) || book.getTitle().equalsIgnoreCase(input)
						|| book.getId().equalsIgnoreCase(input)) {
					System.out.println("book returned");
					System.out.println(book);
					book.setAvailable(true);
					flag = false;

				}
			}
		}
		if (flag) {
			System.out.println("book not found");
		}

	}

	public void removeBook() {
		System.out.println("Enter the book author or title or id");
		String input = sc.next();
		boolean flag = true;
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if (book.isAvailable()) {
				if (book.getAuthor().equalsIgnoreCase(input) || book.getTitle().equalsIgnoreCase(input)
						|| book.getId().equalsIgnoreCase(input)) {
					books.remove(book);
					System.err.println("book removed");
					flag = false;

				}
			}
		}
		if (flag) {
			System.out.println("book not found");
		}
	}

	public void sortBooks() {
		System.out.println("Enter 1 to sortbook by id\n 2 to sortbook by title\n 3 sortbook by author");
		Comparator<Book> comp = null;

		switch (sc.nextInt()) {
		case 1:
			comp = new Id();
			break;

		case 2:
			comp = new Title();
			break;
		case 3:
			comp = new Author();
			break;
		}
		Collections.sort(books, comp);
		System.out.println(books);

	}
}
