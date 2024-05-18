package interfaceDoneInClass;

import java.util.function.BiConsumer;

public class BiConsumerSample {

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer =
                (firstName, lastName)-> System.out.println("Welcome to programming " + firstName + " " +lastName);

        biConsumer.accept("John", "Doe");
    }
}
