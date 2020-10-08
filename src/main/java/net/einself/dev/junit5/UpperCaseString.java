package net.einself.dev.junit5;

import java.util.function.UnaryOperator;

public class UpperCaseString implements UnaryOperator<String> {

    @Override
    public String apply(String string) {
        return string.toUpperCase();
    }

}
