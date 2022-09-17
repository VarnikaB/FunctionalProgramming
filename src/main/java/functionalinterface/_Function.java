package functionalinterface;

import java.util.function.Function;

public class _Function {

    //Function<Input, Output>
    static Function<Integer, Integer> incrementByOne = number -> ++number;

    public static void main(String[] args) {
        Integer increment = incrementByOne.apply(0);
        System.out.println(increment);

    }

}
