import java.util.Objects;

public class Post implements Comparable<Post> {
    private Author author;
    private String title;
    private String body;
    private Categories category;

    public Post(
        Author author,
        String title,
        String body,
        Categories category
    ) {
        setAuthor(author);
        setTitle(title);
        setBody(body);
        setCategory(category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            this.author,
            this.title,
            this.body,
            this.category
        );
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || object.getClass() != getClass()) {
            return false;
        }

        Post other = (Post)object;

        return other.getAuthor().equals(this.author)
            && other.getTitle().equals(this.title)
            && other.getBody().equals(this.body)
            && other.getCategory().equals(this.category);
    }

    @Override
    public int compareTo(Post other) {
        return this.title.compareTo(other.getTitle());
    }

    @Override
    public String toString() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getBody() {
        return this.body;
    }

    public Categories getCategory() {
        return this.category;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }
}