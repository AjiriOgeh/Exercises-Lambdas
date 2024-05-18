package interfaceDoneInClass;


import java.util.function.BiPredicate;

public class BiPredicateSample {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (firstNumber, secondNumber)-> (firstNumber + secondNumber) % 5 == 0;

        System.out.println(biPredicate.test(15, 30));
    }
}
