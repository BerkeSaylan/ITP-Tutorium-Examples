package de.tum.cit.ase;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HashSetAndStreamExamples {
    public boolean isEven2(int x) {
        return x % 2 == 0;
    }

    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Orange");

        // Combining two sets
        set1.addAll(set2);
        System.out.println("Combined Set: " + set1);

        // Clearing a set
        set2.clear();
        System.out.println("Set2 after clearing: " + set2);


        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println("Is 5 even? " + isEven.test(5));
        System.out.println("Is 10 even? " + isEven.test(10));



        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using a Predicate with Streams to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Original Numbers: " + numbers);
        System.out.println("Even Numbers: " + evenNumbers);



        List<String> numbersAsString = Arrays.asList("1", "2", "3", "4", "5");

        // Mapping to IntStream
        int sum = numbersAsString.stream()
                .mapToInt(Integer::parseInt)
                .sum();

        double average = numbersAsString.stream().mapToInt(Integer::parseInt)
                .average()
                .orElse(0.0);

        System.out.println("Original Numbers: " + numbersAsString);
        System.out.println("Sum: " + sum);
       // System.out.println("Average: " + average.orElse(0.0)); // Default value if no average is present


        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango");

        String fruit = fruits.stream()
                .filter(f -> f.startsWith("B"))
                .findAny()
                .orElseThrow(() -> new RuntimeException("No fruit starting with 'B' found"));

        System.out.println("Found Fruit: " + fruit);







        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 2, 85.5));
        studentList.add(new Student("Bob", 3, 78.0));
        studentList.add(new Student("Charlie", 1, 92.3));
        studentList.add(new Student("David", 2, 88.7));

        Map<Integer, Double> removalMap = new HashMap<>();
        removalMap.put(2, 85.5);
        removalMap.put(1, 85.5);

        // Using removeIf to remove students based on the removalMap
        boolean removed = studentList.removeIf(student -> {
            return student.getName().equals("Berke");
        });

        System.out.println("Original Student List: " + studentList);
        System.out.println("Students removed: " + removed);




        Map<String, Double> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 85.5);
        studentGrades.put("Bob", 78.0);
        studentGrades.put("Charlie", 92.3);
        studentGrades.put("David", 88.7);

        // Use streams to iterate over the set of keys and print each student's name and grade
        studentGrades.keySet().stream()
                .forEach(name -> {
                    double grade = studentGrades.get(name);
                    System.out.println(name + "'s Grade: " + grade);
                });
    }
}
