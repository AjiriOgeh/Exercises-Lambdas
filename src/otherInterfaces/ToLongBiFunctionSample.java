package otherInterfaces;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionSample {

    public static void main(String[] args) {
        ToLongBiFunction<Long, Long> toLongBiFunction = (firstNumber, secondNumber)-> firstNumber / secondNumber;

        System.out.println(toLongBiFunction.applyAsLong(100L, 50L));
    }
}
