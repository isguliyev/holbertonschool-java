public class Program {
	public static void main(String[] args) {
		try {
			PositiveInteger positiveInteger = new PositiveInteger("1");
			System.out.println(positiveInteger.getValue() + " - " + positiveInteger.isPrime());
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}

		try {
			PositiveInteger positiveInteger = new PositiveInteger("43");
			System.out.println(positiveInteger.getValue() + " - " + positiveInteger.isPrime());
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}

		try {
			PositiveInteger positiveInteger = new PositiveInteger("0");;
			positiveInteger.setValue(-1);
			System.out.println(positiveInteger.getValue() + " - " + positiveInteger.isPrime());
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}

		try {
			PositiveInteger positiveInteger = new PositiveInteger("0");;
			positiveInteger.setValue(positiveInteger.getValue() + 1);
			System.out.println(positiveInteger.getValue() + " - " + positiveInteger.isPrime());
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}

		try {
			PositiveInteger positiveInteger = new PositiveInteger("-3");
			System.out.println(positiveInteger.getValue() + " - " + positiveInteger.isPrime());
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}

		try {
			PositiveInteger positiveInteger = new PositiveInteger(379);
			System.out.println(positiveInteger.getValue() + " - " + positiveInteger.isPrime());
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}

		try {
			PositiveInteger positiveInteger = new PositiveInteger(378);
			System.out.println(positiveInteger.getValue() + " - " + positiveInteger.isPrime());
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}
	}
}