public class Person {
    public static boolean emailValid(String email) {
        if (!email.contains("@") || email.length() > 50) {
            return false;
        }

        return true;
    }
}