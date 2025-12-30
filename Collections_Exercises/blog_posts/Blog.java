import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.ArrayList;

public class Blog {
    private List<Post> posts;

    public Blog() {
        setPosts(new ArrayList<Post>());
    }

    public Map<Author, Set<Post>> getAllPostsByAuthor() {
        Map<Author, Set<Post>> allPostsByAuthors = new TreeMap<Author, Set<Post>>();

        for (Post post : this.posts) {
            if (!allPostsByAuthors.containsKey(post.getAuthor())) {
                allPostsByAuthors.put(post.getAuthor(), new TreeSet<Post>());
            }

            allPostsByAuthors.get(post.getAuthor()).add(post);
        }

        return allPostsByAuthors;
    }

    public Map<Categories, Set<Post>> getAllPostsByCategories() {
        Map<Categories, Set<Post>> allPostsByCategories = new TreeMap<Categories, Set<Post>>();

        for (Post post : this.posts) {
            if (!allPostsByCategories.containsKey(post.getCategory())) {
                allPostsByCategories.put(post.getCategory(), new TreeSet<Post>());
            }
            allPostsByCategories.get(post.getCategory()).add(post);
        }

        return allPostsByCategories;
    }

    public Set<Post> getPostsByAuthor(Author author) {
        Set<Post> postsByAuthor = new TreeSet<Post>();

        for (Post post : this.posts) {
            if (post.getAuthor().equals(author)) {
                postsByAuthor.add(post);
            }
        }

        return postsByAuthor;
    }

    public Set<Post> getPostsByCategory(Categories category) {
        Set<Post> postsByCategory = new TreeSet<Post>();

        for (Post post : this.posts) {
            if (post.getCategory().equals(category)) {
                postsByCategory.add(post);
            }
        }

        return postsByCategory;
    }

    public Map<Categories, Integer> getCountByCategory() {
        Map<Categories, Integer> categoryFrequency = new TreeMap<Categories, Integer>();

        for (Post post : this.posts) {
            categoryFrequency.put(
                post.getCategory(),
                categoryFrequency.getOrDefault(post.getCategory(), 0) + 1
            );
        }

        return categoryFrequency;
    }

    public Set<Author> getAllAuthors() {
        Set<Author> authors = new TreeSet<Author>();

        for (Post post : this.posts) {
            authors.add(post.getAuthor());
        }

        return authors;
    }

    public void addPost(Post postToAdd) throws RuntimeException {
        for (Post post : this.posts) {
            if (
                post.getAuthor().equals(postToAdd.getAuthor())
                && post.getTitle().equals(postToAdd.getTitle())
            ) {
                throw new RuntimeException("Post already exists");
            }
        }

        this.posts.add(postToAdd);
    }

    public List<Post> getPosts() {
        return this.posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}