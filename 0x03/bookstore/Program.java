public class Program {
	public static void main(String[] args) {
		try {
			Book book1 = new Book(
				"Robinson Crusoe",
				"Daniel Defoe",
				56.0d
			);

			System.out.println(book1);
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}

		try {
			GoldEditionBook goldEditionBook1 = new GoldEditionBook(
				"Frankenstein",
				"Mary Shelley",
				38.30d
			);

			System.out.println(goldEditionBook1);
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}

		try {
			GoldEditionBook goldEditionBook2 = new GoldEditionBook(
				"Alice’s Adventures in Wonderland",
				"Lewis Carroll",
				21.88d
			);

			System.out.println(goldEditionBook2);
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}

		try {
			Book book2 = new Book(
				"Dracula",
				"Bram Stoker",
				15.99d
			);

			System.out.println(book2);
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}

		try {
			Book book3 = new Book(
				"The Great Gatsby",
				"F. Scott Fitzgerald",
				0.0d
			);

			System.out.println(book3);
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}
	}
}