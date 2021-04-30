package HackerRank.desafios;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Based on age, return if is young, teenager or old.
 * <p>
 * You must confirm that the age is not negative, if it negative then is invalid and should be considered 0 - zero.
 * age < 13 are young, between inclusive 13 and 18 a teenager, otherwise old.
 * <p>
 * See also: https://www.hackerrank.com/challenges/30-class-vs-instance/problem
 * <p>
 * @author Bruno
 * @version 1.0.0
 */

public class Day04Person {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Day04Person(int initialAge) {
        // Checks on initialAge if it is negative, if negative, age = 0 and a message print.
        if (initialAge >= 0) {
            setAge(initialAge);
        } else {
            setAge(0);
            System.out.println("Age is not valid, setting age to 0.");
        }

    }

    public void amIOld() {
        // Code determining if this person's age is old and print the correct statement:
        if (getAge() >= 13 && getAge() < 18) {
            System.out.println("You are a teenager.");
        } else if (getAge() < 13) {
            System.out.println("You are young.");
        } else {
            System.out.println("You are old.");
        }

    }

    public void yearPasses() {
        int newAge = getAge();
        newAge++;
        setAge(newAge);

    }

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int testCases = scan.nextInt();

            for (int i = 0; i < testCases; i++) {

                int age = scan.nextInt();

                Day04Person person = new Day04Person(age);
                person.amIOld();

                IntStream.range(0, 3).forEach(p -> person.yearPasses());
                person.amIOld();
                System.out.println();

            }
        }
    }
}
