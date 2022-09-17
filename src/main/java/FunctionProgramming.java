import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;
import java.util.List;
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

        List<Person> females = people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());

        females.forEach(System.out::println );


    }

    private static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){

            this.name = name;
            this.gender = gender;
        }

        @Override
        public String  toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
