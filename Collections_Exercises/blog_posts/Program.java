import java.util.Map;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Blog blog = new Blog();

		Author author1 = new Author("John", "Bannons");
		Author author2 = new Author("Jane", "Doe");
		Author author3 = new Author("Peter", "Dirkly");

		Post post1 = new Post(
			author1,
			"How to Implement Terraform",
			"Implementing IaC with Terraform bla bla bla",
			Categories.DEVOPS
		);

		Post post2 = new Post(
			author1,
			"Working with the Set Interface in Java",
			"The Set interface is implemented by several collections in Java bla bla bla",
			Categories.DEVELOPMENT
		);

		Post post3 = new Post(
			author2,
			"Publishing GitLab Pipelines",
			"To publish pipelines in GitLab bla bla bla",
			Categories.DEVOPS
		);

		Post post4 = new Post(
			author2,
			"Azure Service Bus Where to Start",
			"First, it's necessary to understand that bla bla bla",
			Categories.DEVOPS
		);

		Post post5 = new Post(
			author2,
			"TDD Made Simple",
			"The TDD software development process bla bla bla",
			Categories.DEVELOPMENT
		);

		Post post6 = new Post(
			author3,
			"Hadoop: The Tool That Will Ease Your Data Processing",
			"Hadoop is a tool bla bla bla",
			Categories.DATA_SCIENCE
		);

		Post post7 = new Post(
			author3,
			"Hadoop: The Tool That Will Ease Your Data Processing",
			"The Hadoop tool bla bla bla",
			Categories.DATA_SCIENCE
		);

		blog.addPost(post1);
		blog.addPost(post2);
		blog.addPost(post3);
		blog.addPost(post4);
		blog.addPost(post5);
		blog.addPost(post6);

		try {
			blog.addPost(post7);
		} catch(Exception exception) {
			System.err.println(exception.getMessage());
		}

		Set<Author> authors = blog.getAllAuthors();

		System.out.println(authors);

		Map<Categories, Integer> counting = blog.getCountByCategory();

		System.out.println(counting);

		Set<Post> postsDevOps = blog.getPostsByCategory(Categories.DEVOPS);

		System.out.println(postsDevOps);

		Set<Post> postsDev = blog.getPostsByCategory(Categories.DEVELOPMENT);

		System.out.println(postsDev);

		Set<Post> postsData = blog.getPostsByCategory(Categories.DATA_SCIENCE);

		System.out.println(postsData);

		Set<Post> postsJaneDoe = blog.getPostsByAuthor(new Author("Jane", "Doe"));

		System.out.println(postsJaneDoe);

		Map<Categories, Set<Post>> postsByCategories = blog.getAllPostsByCategories();

		System.out.println(postsByCategories);

		Map<Author, Set<Post>> postsByAuthor = blog.getAllPostsByAuthor();

		System.out.println(postsByAuthor);
	}
}