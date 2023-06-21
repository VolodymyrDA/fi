package org.maxim;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.*;

import static org.assertj.core.api.Assertions.*;

class FiUtilsTest {

    @Test
    void shouldPredicateReturnTrue() {

        IntPredicate predicate = FiUtils.getPredicate();

        boolean result = predicate.test(17);

        assertThat(result).isTrue();
    }

    @Test
    void shouldPredicateReturnFalse() {

        IntPredicate predicate = FiUtils.getPredicate();

        boolean result = predicate.test(18);

        assertThat(result).isFalse();
    }


    @Test
    void shouldConsumerPrintCorrect() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        FiUtils.getConsumer().accept(5);

        assertThat(outContent.toString()).hasToString("0 1 2 3 4 5 \n");
        System.setOut(System.out);
    }

    @Test
    void shouldSupplierReturnCurrentDayOfWeek() {

        Supplier<DayOfWeek> supplier = FiUtils.getSupplier();

        DayOfWeek result = supplier.get();

        assertThat(result).isEqualTo(LocalDate.now().getDayOfWeek());
    }

    @Test
    void shouldFunctionCorrect() {

        Function<Double, Long> function = FiUtils.getFunction();

        Long result = function.apply(10.66);

        assertThat(result).isEqualTo(11);
    }

    @Test
    void shouldUnaryOperatorCorrect() {

        LongUnaryOperator unaryOperator = FiUtils.getUnaryOperator();

        Long result = unaryOperator.applyAsLong(10);

        assertThat(result).isEqualTo(55);
    }
}