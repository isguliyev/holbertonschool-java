import java.util.TreeSet;
import java.util.HashSet;

public class DuplicatedNumbers {
    public static TreeSet<Integer> isFind(int[] integers) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        if (integers == null) {
            return treeSet;
        }

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int integer : integers) {
            if (!hashSet.add(integer)) {
                treeSet.add(integer);
            }
        }

        return treeSet;
    }
}