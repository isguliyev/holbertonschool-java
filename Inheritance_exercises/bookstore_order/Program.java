public class Program {
	public static void main(String[] args) {
		products.Book book1 = new products.Book(
			"Dune",
			2017,
			"United States",
			56.3d,
			680,
			"Frank Herbert",
			1
		);

		products.Book book2 = new products.Book(
			"One of Us Is Lying",
			2018,
			"United States",
			34.93d,
			384,
			"Karen McManus",
			1
		);

		products.Book book3 = new products.Book(
			"War And Peace",
			1869,
			"United States",
			31.7d,
			272,
			"Leo Tolstoy",
			1
		);

		products.Dvd dvd1 = new products.Dvd(
			"Underworld - Blood Wars",
			2016,
			"United States",
			16.9d,
			"Anna Foerster",
			"Action",
			91
		);

		products.Dvd dvd2 = new products.Dvd(
			"Annabelle - Creation",
			2017,
			"United States",
			39.9d,
			"Jame Wan and Peter Safran",
			"Horror",
			109
		);

		ItemOrder[] itemOrder1 = new ItemOrder[] {
			new ItemOrder(book1, 1),
			new ItemOrder(dvd2, 1)
		};

		Order order1 = new Order(0, itemOrder1);

		System.out.printf("Total Order: %.2f\n", order1.calculateTotal());

		ItemOrder[] itemOrder2 = new ItemOrder[] {
			new ItemOrder(book1, 1),
			new ItemOrder(dvd2, 1)
		};

		Order order2 = new Order(10, itemOrder2);

		System.out.printf("Total Order: %.2f\n", order2.calculateTotal());

		ItemOrder[] itemOrder3 = new ItemOrder[] {
			new ItemOrder(book2, 1),
			new ItemOrder(book3, 2),
			new ItemOrder(dvd1, 1)
		};

		Order order3 = new Order(5, itemOrder3);

		System.out.printf("Total Order: %.2f\n", order3.calculateTotal());

		ItemOrder[] itemOrder4 = new ItemOrder[] {
			new ItemOrder(book2, 1),
			new ItemOrder(book2, 1),
			new ItemOrder(book3, 2),
			new ItemOrder(dvd1, 1),
			new ItemOrder(dvd2, 2)
		};

		Order order4 = new Order(5, itemOrder4);

		System.out.printf("Total Order: %.2f\n", order4.calculateTotal());
	}
}