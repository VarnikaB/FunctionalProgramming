package imperative;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionProgramming {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Esha", Gender.FEMALE),
                new Person("Alice ", Gender.FEMALE),
                new Person("John", Gender.MALE),
                new Person("Alex", Gender.MALE)
        );

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);

        List<Person> females = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());

        females.forEach(System.out::println);


    }

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
}
