import java.util.List;
import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();

		try {
			ManipulateArrayNumbers.addNumber(numbers, 1);
			ManipulateArrayNumbers.addNumber(numbers, 3);
			ManipulateArrayNumbers.addNumber(numbers, 6);
			ManipulateArrayNumbers.addNumber(numbers, 9);
		} catch(Exception exception) {
			System.err.println(exception.getMessage());
		}

		System.out.println(numbers);

		try {
			ManipulateArrayNumbers.addNumber(numbers, 9);
		} catch(Exception exception) {
			System.err.println(exception.getMessage());
		}

		try {
			ManipulateArrayNumbers.removeNumber(numbers, 3);
			ManipulateArrayNumbers.removeNumber(numbers, 9);
		} catch(Exception exception) {
			System.err.println(exception.getMessage());
		}

		System.out.println(numbers);

		try {
			ManipulateArrayNumbers.removeNumber(numbers, 9);
		} catch(Exception exception) {
			System.err.println(exception.getMessage());
		}

		try {
			ManipulateArrayNumbers.replaceNumber(numbers, 3, 5);
		} catch(Exception exception) {
			System.err.println(exception.getMessage());
		}

		System.out.println(numbers);

		try {
			ManipulateArrayNumbers.replaceNumber(numbers, 5, 3);
		} catch(Exception exception) {
			System.err.println(exception.getMessage());
		}

		System.out.println(numbers);
	}
}