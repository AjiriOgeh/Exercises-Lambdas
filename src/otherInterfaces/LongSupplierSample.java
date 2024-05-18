package otherInterfaces;

import java.security.SecureRandom;
import java.util.function.LongSupplier;

public class LongSupplierSample {

    public static void main(String[] args) {
        LongSupplier longSupplier = ()-> new SecureRandom().nextLong(0, 500);

        System.out.println(longSupplier.getAsLong());
    }
}
