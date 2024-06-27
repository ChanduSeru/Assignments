package list;

import java.util.*;

public class NameOccurrences {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
            "mark", "Minni", "lofi", "Anna", "Joha", 
            "mark", "Minni", "lofi", "lodo", "Joha"
        );

        Map<String, Integer> nameCounts = new HashMap<>();

        // Count occurrences of each name
        for (String name : names) {
            if (nameCounts.containsKey(name)) {
                nameCounts.put(name, nameCounts.get(name) + 1);
            } else {
                nameCounts.put(name, 1);
            }
        }

        // Print the occurrences
        for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " occurrences");
        }
    }
}