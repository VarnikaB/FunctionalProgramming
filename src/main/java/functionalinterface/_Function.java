package functionalinterface;

import java.util.function.Function;

public class _Function {

    //Function<Input, Output>
    static Function<Integer, Integer> incrementByOne = number -> ++number;
    static Function<Integer, Integer> multiplyByTen = number -> number * 10;

    public static void main(String[] args) {

        Integer increment = incrementByOne.apply(1);
        System.out.println(increment);

        Integer product = multiplyByTen.apply(increment);
        System.out.println(product);

    }

}
