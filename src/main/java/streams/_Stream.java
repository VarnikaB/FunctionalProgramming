package streams;

import imperative.FunctionProgramming;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _Stream {
    enum Gender {
        MALE, FEMALE
    }

    private static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {

            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Esha", Gender.FEMALE),
                new Person("Alice ", Gender.FEMALE),
                new Person("John", Gender.MALE),
                new Person("Alex", Gender.MALE)
        );

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }
}
