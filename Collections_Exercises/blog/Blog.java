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

    public Map<String, Integer> getCountByCategory() {
        Map<String, Integer> countByCategory = new TreeMap<String, Integer>();

        for (Post post : this.posts) {
            countByCategory.put(post.getCategory(),
                countByCategory.getOrDefault(post.getCategory(), 0) + 1);
        }

        return countByCategory;
    }

    public Set<String> getAllAuthors() {
        Set<String> authors = new TreeSet<String>();

        for (Post post : this.posts) {
            authors.add(post.getAuthor());
        }

        return authors;
    }

    public void addPost(Post post) {
        this.posts.add(post);
    }

    public List<Post> getPosts() {
        return this.posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}