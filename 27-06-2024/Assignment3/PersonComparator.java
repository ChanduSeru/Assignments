import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class PersonComparator {

    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Remo", 25));
        persons.add(new Person("Ragav", 20));
        persons.add(new Person("Chitti", 30));

        // Sort persons by age using Comparator and lambda expression
        Collections.sort(persons, (p1, p2) -> p1.getAge() - p2.getAge());

        // Print sorted persons
        System.out.println("Persons sorted by age:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}