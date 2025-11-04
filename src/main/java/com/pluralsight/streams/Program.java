package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Abel", "Tadesse", 22));
        people.add(new Person("Betelhem", "Kifle", 27));
        people.add(new Person("Dawit", "Tesfaye", 31));
        people.add(new Person("Meron", "Gebremariam", 25));
        people.add(new Person("Nahom", "Haile", 29));
        people.add(new Person("Samrawit", "Bekele", 24));
        people.add(new Person("Yonas", "Abebe", 34));
        people.add(new Person("Hana", "Mengistu", 20));
        people.add(new Person("Kaleb", "Worku", 28));
        people.add(new Person("Mikiyas", "Asfaw", 23));

        System.out.print("Enter a first or last name to search: ");
        String searchName = scanner.nextLine().toLowerCase();

        List<Person> matches = new ArrayList<>();
        for (Person p : people) {
            if (p.getFirstName().toLowerCase().contains(searchName) ||
                    p.getLastName().toLowerCase().contains(searchName)) {
                matches.add(p);
            }
        }

        if (matches.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            System.out.println("\nMatching people:");
            for (Person p : matches) {
                System.out.println(p);
            }
        }
    }
}
