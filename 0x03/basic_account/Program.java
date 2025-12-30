public class Program {
	public static void main(String[] args) {
		try {
			BasicBankAccount account1 = new BasicBankAccount("AAA", 50.0d);

			System.out.println(account1);

			account1.deposit(100.0d);

			System.out.println(account1);

			account1.withdraw(25.0d);

			System.out.println(account1);

			account1.applyMonthlyUpdate();

			System.out.println(account1);
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		} finally {
			System.out.println();
		}

		try {
			BasicBankAccount account2 = new BasicBankAccount("BBB", 100.0d);

			System.out.println(account2);

			account2.deposit(10.0d);

			System.out.println(account2);

			account2.withdraw(10.0d);

			System.out.println(account2);

			account2.applyMonthlyUpdate();

			System.out.println(account2);
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		} finally {
			System.out.println();
		}

		try {
			BasicBankAccount account3 = new BasicBankAccount("CCC", 120.0d);

			System.out.println(account3);

			account3.deposit(1600.0d);

			System.out.println(account3);

			account3.applyMonthlyUpdate();

			System.out.println(account3);
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		} finally {
			System.out.println();
		}

		try {
			BasicBankAccount account4 = new BasicBankAccount("DDD", 70.0d);

			System.out.println(account4);

			account4.deposit(0.0d);
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		} finally {
			System.out.println();
		}

		try {
			BasicBankAccount account5 = new BasicBankAccount("EEE", 50.0d);

			System.out.println(account5);

			account5.deposit(25.0d);

			System.out.println(account5);

			account5.withdraw(30.0d);
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}
	}
}