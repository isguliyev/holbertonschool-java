import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;

public class DuplicatedNumbers {
    public static Set<Integer> isFind(int[] integers) {
        Set<Integer> treeSet = new TreeSet<Integer>();

        if (integers == null) {
            return treeSet;
        }

        Set<Integer> hashSet = new HashSet<Integer>();

        for (int integer : integers) {
            if (!hashSet.add(integer)) {
                treeSet.add(integer);
            }
        }

        return treeSet;
    }
}