public class Program {
	public static void main(String[] args) {
		try {
			FeeBasedBankAccount account1 = new FeeBasedBankAccount("AAA", 30.0d);

			System.out.println(account1);

			account1.deposit(125.0d);

			System.out.println(account1);

			account1.withdraw(30.0d);

			System.out.println(account1);

			account1.deposit(10.0d);

			System.out.println(account1);
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		} finally {
			System.out.println();
		}

		try {
			ControlledBankAccount account2 = new ControlledBankAccount("BBB", 30.0d, 20.0d, 5.0d);

			System.out.println(account2);

			account2.deposit(125.0d);

			System.out.println(account2);

			account2.withdraw(105.0d);

			System.out.println(account2);

			account2.applyMonthlyUpdate();

			System.out.println(account2);
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		} finally {
			System.out.println();
		}

		try {
			ControlledBankAccount account3 = new ControlledBankAccount("CCC", 30.0d, 20.0d, 5.0d);

			System.out.println(account3);

			account3.deposit(125.0d);

			System.out.println(account3);

			account3.withdraw(106.0d);

			System.out.println(account3);

			account3.applyMonthlyUpdate();

			System.out.println(account3);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
}