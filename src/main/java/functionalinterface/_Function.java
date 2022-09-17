package functionalinterface;

import java.util.function.Function;

public class _Function {

    //Function<Input, Output>
    static Function<Integer, Integer> incrementByOne = number -> ++number;
    static Function<Integer, Integer> multiplyByTen = number -> number * 10;

    public static void main(String[] args) {

        Function<Integer, Integer> incrementByOneAndThenMultiplyByTen
                = incrementByOne.andThen(multiplyByTen);

        Integer result = incrementByOneAndThenMultiplyByTen.apply(1);
        System.out.println(result);

    }

}
