package interfaceDoneInClass;

import java.util.function.Predicate;

public class PredicateSample {

    public static void main(String[] args) {
        Predicate<Integer> predicate = number-> number % 3 == 0;

        System.out.println(predicate.test(9));
    }
}
