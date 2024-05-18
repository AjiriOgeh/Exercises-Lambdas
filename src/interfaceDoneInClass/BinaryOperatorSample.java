package interfaceDoneInClass;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (firstNumber, secondNumber)-> firstNumber - secondNumber;

        System.out.println(binaryOperator.apply(10, 5));
    }
}
