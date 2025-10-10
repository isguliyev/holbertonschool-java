package products;

public class Book extends Product {
    private int pages;
    private String author;
    private int edition;

    public Book(
        String title,
        int year,
        String country,
        double grossPrice,
        int pages,
        String author,
        int edition) {
            super(title, year, country, grossPrice);
            setPages(pages);
            setAuthor(author);
            setEdition(edition);
    }

    @Override
    public double getNetPrice() {
        return getGrossPrice() * 1.15d;
    }

    public int getPages() {
        return this.pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getEdition() {
        return this.edition;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}