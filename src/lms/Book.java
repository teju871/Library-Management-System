package lms;

public class Book {
	   private String author;
	   private String title;
	   private String id;
		private boolean isAvailable;

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		@Override
		public String toString() {
			return "Book [author=" + author + ", title=" + title + ", id=" + id + ", isAvailable=" + isAvailable + "]";
		}

		public Book(String author, String title, String id, boolean isAvailable) {
			super();
			this.author = author;
			this.title = title;
			this.id = id;
			this.isAvailable = isAvailable;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public boolean isAvailable() {
			return isAvailable;
		}

		public void setAvailable(boolean isAvailable) {
			this.isAvailable = isAvailable;
		}
	}
