package interfaceDoneInClass;

import java.security.SecureRandom;
import java.util.function.Supplier;

public class SupplierSample {

    public static void main(String[] args) {
        Supplier<Character> supplier = ()-> (char)new SecureRandom().nextInt(35, 120);

        System.out.println(supplier.get());
    }
}
