public class EmailTest {
    public static boolean test_email_with_at_symbol() {
        return Person.emailValid("email_test@domain.com");
    }

    public static boolean test_email_without_at_symbol() {
        return !Person.emailValid("email_testdomain.com");
    }

    public static boolean test_email_over_50_characters() {
        return !Person.emailValid(
            "email_test_very_long_should_not_be_valid@domain.com");
    }
}