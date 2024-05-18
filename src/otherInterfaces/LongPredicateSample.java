package otherInterfaces;

import java.util.function.LongPredicate;

public class LongPredicateSample {

    public static void main(String[] args) {
        LongPredicate longPredicate = (number) -> (number + 5) % 10 == 0;

        System.out.println(longPredicate.test(30L));
    }
}
