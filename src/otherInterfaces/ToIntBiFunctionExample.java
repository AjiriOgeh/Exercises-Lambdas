package otherInterfaces;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionExample {

    public static void main(String[] args) {
        ToIntBiFunction<Integer, Integer> toIntBiFunction = Integer::sum;

        System.out.println(toIntBiFunction.applyAsInt(5, 10));
    }
}
