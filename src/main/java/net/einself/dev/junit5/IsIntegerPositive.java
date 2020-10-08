package net.einself.dev.junit5;

import java.util.function.Predicate;

public class IsIntegerPositive implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer != null && integer > 0;
    }

}
