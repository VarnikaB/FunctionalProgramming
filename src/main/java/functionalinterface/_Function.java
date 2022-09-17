package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    //Function<Input, Output>
    static Function<Integer, Integer> incrementByOne = number -> ++number;
    static Function<Integer, Integer> multiplyByTen = number -> number * 10;
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBy =
            (numberToIncrementByOne, numberToMultiplyBy) ->
                    (++numberToIncrementByOne) * numberToMultiplyBy;

    public static void main(String[] args) {

        //Bifunction takes 2 parameters
        Integer result = incrementByOneAndMultiplyBy.apply(2, 4);
        System.out.println(result);
    }

}
