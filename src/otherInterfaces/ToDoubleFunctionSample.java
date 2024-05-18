package otherInterfaces;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionSample {
    public static void main(String[] args) {
        ToDoubleFunction<Double> toDoubleFunction = Math::ceil;

        System.out.println(toDoubleFunction.applyAsDouble(9.8));
    }
}
