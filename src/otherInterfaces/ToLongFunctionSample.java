package otherInterfaces;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.function.ToLongFunction;

public class ToLongFunctionSample {

    public static void main(String[] args) {
        ToLongFunction<String> toLongFunction = date-> {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
            LocalDate convertedDate = LocalDate.parse(date,dateTimeFormatter);
            LocalDate presentDate = LocalDate.now();
            return ChronoUnit.DAYS.between(convertedDate, presentDate);
        };

        System.out.println(toLongFunction.applyAsLong("1/1/2024"));
    }
}
