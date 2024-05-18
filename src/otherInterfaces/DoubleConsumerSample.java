package otherInterfaces;

import java.util.function.DoubleConsumer;

public class DoubleConsumerSample {

    public static void main(String[] args) {
        DoubleConsumer doubleConsumer = number-> System.out.println(number * Math.PI);

        doubleConsumer.accept(7);
    }
}
