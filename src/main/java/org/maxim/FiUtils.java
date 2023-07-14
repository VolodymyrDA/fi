package org.maxim;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter(AccessLevel.PUBLIC)
public class FiUtils {
    @Getter
    private static final IntPredicate predicate = x -> {
        boolean isPrime = false;
        for (int i = 1; i < x - 1; i++) {
            if (x % i == 0) {
                isPrime = true;
                break;
            }
        }

        return isPrime;
    };

    @Getter
    private static final IntConsumer consumer = x -> {
        for (int i = 0; i <= x; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    };
    //implement this
    @Getter
    private static final Supplier<DayOfWeek> supplier = () -> LocalDate.now().getDayOfWeek();
    //implement this
    @Getter
    private static final Function<Double, Long> function = x -> Math.round(x);
    //implement this
    @Getter
    private static final LongUnaryOperator unaryOperator = x -> {
        int fibonaci = 0;
        for (int i = 1; i <= x; i++) {
            if (i == 1)
                fibonaci = i + 1;
            else {
                fibonaci += i;
            }
        }
        return fibonaci;
    };
}

