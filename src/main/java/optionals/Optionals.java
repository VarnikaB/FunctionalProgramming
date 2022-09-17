package optionals;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        Optional.ofNullable("Hello")
                .ifPresentOrElse(System.out::println, ()-> {
                    System.out.println("Something is wrong");
                });
    }
}
