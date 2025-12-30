public class Post {
    private String author;
    private String title;
    private String body;
    private String category;

    public Post(
        String author,
        String title,
        String body,
        String category
    ) {
        setAuthor(author);
        setTitle(title);
        setBody(body);
        setCategory(category);
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getBody() {
        return this.body;
    }

    public String getCategory() {
        return this.category;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}