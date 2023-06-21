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
    private static final IntPredicate predicate = null;

    @Getter
    private static final IntConsumer consumer = null;
    //implement this
    @Getter
    private static final Supplier<DayOfWeek> supplier = null;
     //implement this
    @Getter
    private static final Function<Double, Long> function = null;
    //implement this
    @Getter
    private static final LongUnaryOperator unaryOperator = null;
}

