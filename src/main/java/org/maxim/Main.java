package org.maxim;

public class Main {
    public static void main(String[] args) {

        System.out.println(FiUtils.getPredicate().test(11));
        FiUtils.getConsumer().accept(8);
        System.out.println(FiUtils.getSupplier().get());
        System.out.println(FiUtils.getFunction().apply(15.36));
        System.out.println(FiUtils.getUnaryOperator().applyAsLong(5));
    }
}