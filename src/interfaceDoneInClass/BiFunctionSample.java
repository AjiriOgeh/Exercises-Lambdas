package interfaceDoneInClass;

import java.util.function.BiFunction;

public class BiFunctionSample {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Boolean> biFunction =
                (firstNumber, secondNumber)-> Math.pow(firstNumber, 2) == secondNumber;

        System.out.println(biFunction.apply(5, 25));
    }

}
