import java.util.List;

public class ManipulateArrayNumbers {
    public static Integer findNumberPosition(List<Integer> numbers,
        Integer number) {

        return numbers.indexOf(number);
    }

    public static void addNumber(List<Integer> numbers,
        Integer number) throws Exception {

        if (numbers.contains(number)) {
            throw new Exception("Number already in the list");
        }

        numbers.add(number);
    }

    public static void removeNumber(List<Integer> numbers,
        Integer number) throws Exception {

        if (!numbers.contains(number)) {
            throw new Exception("Number not found in the list");
        }

        numbers.remove(number);
    }

    public static void replaceNumber(List<Integer> numbers,
        Integer numberToReplace,
        Integer replacementNumber) {

        int index = numbers.indexOf(numberToReplace);

        if (index == -1) {
            numbers.add(replacementNumber);
        } else {
            numbers.set(index, replacementNumber);
        }
    }
}