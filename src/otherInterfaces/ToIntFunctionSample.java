package otherInterfaces;

import java.util.function.ToIntFunction;

public class ToIntFunctionSample {

    public static void main(String[] args) {
        ToIntFunction<Integer> toIntFunction = number-> number * 5;

        System.out.println(toIntFunction.applyAsInt(9));
    }
}
