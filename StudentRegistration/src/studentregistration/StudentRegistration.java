package studentregistration;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> ids = new HashSet<>();        
        HashMap<Integer, String> students = new HashMap<>();

   for (int i = 1; i <= 5; i++) {
    System.out.print("Enter student ID " + i + ": ");
    int id = sc.nextInt();
    sc.nextLine();

    if (!ids.add(id)) {
        System.out.println("Duplicate ID " + id + " rejected.");
        continue;
    }

    System.out.print("Enter name for ID " + id + ": ");
    students.put(id, sc.nextLine());
}

      
        System.out.println("\nUnique students: " + ids.size());

        TreeMap<Integer, String> sorted = new TreeMap<>(students);
        System.out.println("\nStudents (ascending by ID):");
        for (var entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        sc.close();
    }
}