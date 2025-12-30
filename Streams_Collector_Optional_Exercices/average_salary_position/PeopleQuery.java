import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class PeopleQuery {
    public static Map<String, Set<Person>> getPeopleGroupedByPositionInReverseOrder(
        List<Person> people
    ) {
        return people.stream().collect(
            Collectors.groupingBy(
                Person::getPosition,
                () -> new TreeMap<String, Set<Person>>(Comparator.reverseOrder()),
                Collectors.toCollection(
                    () -> new TreeSet<>(Comparator.comparing(Person::getName))
                )
            )
        );
    }

    public static Map<String, Long> getPeopleCountByPosition(List<Person> people) {
        return people.stream().collect(
            Collectors.groupingBy(Person::getPosition, Collectors.counting())
        );
    }

    public static Map<String, Map<Integer, Long>> getPeopleCountByPositionAndAge(
        List<Person> people
    ) {
        return people.stream().collect(
            Collectors.groupingBy(
                Person::getPosition,
                Collectors.groupingBy(Person::getAge, Collectors.counting())
            )
        );
    }

    public static Map<String, Double> getAverageSalaryByPosition(List<Person> people) {
        return people.stream().collect(
            Collectors.groupingBy(
                Person::getPosition,
                Collectors.averagingDouble(Person::getSalary)
            )
        );
    }
}