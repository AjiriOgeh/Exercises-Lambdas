package otherInterfaces;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorSample {

    public static void main(String[] args) {
        DoubleBinaryOperator doubleBinaryOperator = (base, perpendicular)-> {
          double hypotenuseSquare = Math.pow(base, 2) + Math.pow(perpendicular, 2);
          return Math.pow(hypotenuseSquare, 0.5);
        };

        System.out.println(doubleBinaryOperator.applyAsDouble(3, 4));
    }
}
